package com.hedian.haian.util;
import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author : jia
 * @Date : 2019/4/3
 * @Description : RestTemplate工具类
 * @Version : 1.0
 */
public class RestTemplateUtil {

	public static String get(RestTemplate restTemplate, String url, JSONObject params) {
		String response = restTemplate.getForObject(expandURL(url, params.keySet()), String.class, params);
		return response;
	}

	public static String post(RestTemplate restTemplate, String url, JSONObject params, MediaType mediaType) {
		// 拿到header信息
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(mediaType);
		HttpEntity<JSONObject> requestEntity = (mediaType == MediaType.APPLICATION_JSON
				|| mediaType == MediaType.APPLICATION_JSON_UTF8) ? new HttpEntity<JSONObject>(params, requestHeaders)
				: new HttpEntity<JSONObject>(null, requestHeaders);
		String result = (mediaType == MediaType.APPLICATION_JSON || mediaType == MediaType.APPLICATION_JSON_UTF8)
				? restTemplate.postForObject(url, requestEntity, String.class)
				: restTemplate.postForObject(expandURL(url, params.keySet()), requestEntity, String.class, params);
		return result;
	}

	public static <T> T post(RestTemplate restTemplate, String url, JSONObject params, MediaType mediaType, Class<T> clz) {
		// 设置header信息
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(mediaType);

		HttpEntity<?> requestEntity = (
				mediaType == MediaType.APPLICATION_JSON
						|| mediaType == MediaType.APPLICATION_JSON_UTF8)
				? new HttpEntity<JSONObject>(params, requestHeaders)
				: (mediaType == MediaType.APPLICATION_FORM_URLENCODED
				? new HttpEntity<MultiValueMap>(createMultiValueMap(params), requestHeaders)
				: new HttpEntity<>(null, requestHeaders));

		restTemplate.setErrorHandler(new DefaultResponseErrorHandler());
		T result = (mediaType == MediaType.APPLICATION_JSON || mediaType == MediaType.APPLICATION_JSON_UTF8)
				? restTemplate.postForObject(url, requestEntity, clz)
				: restTemplate.postForObject(mediaType == MediaType.APPLICATION_FORM_URLENCODED
				? url
				: expandURL(url, params.keySet()), requestEntity, clz, params);

		return result;
	}

	public static MultiValueMap<String, String> createMultiValueMap(JSONObject params) {
		MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
		for (String key : params.keySet()) {
			if (params.get(key) instanceof List) {
				for (Iterator<String> it = ((List<String>) params.get(key)).iterator(); it.hasNext(); ) {
					String value = it.next();
					map.add(key, value);
				}
			} else {
				map.add(key, params.getString(key));
			}
		}
		return map;
	}

	public static String expandURL(String url, Set<?> keys) {
		final Pattern QUERY_PARAM_PATTERN = Pattern.compile("([^&=]+)(=?)([^&]+)?");
		Matcher mc = QUERY_PARAM_PATTERN.matcher(url);
		StringBuilder sb = new StringBuilder(url);
		if (mc.find()) {
			sb.append("&");
		} else {
			sb.append("?");
		}

		for (Object key : keys) {
			sb.append(key).append("=").append("{").append(key).append("}").append("&");
		}
		return sb.deleteCharAt(sb.length() - 1).toString();
	}

	public static HttpHeaders getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
		headers.setContentType(type);
		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
		return headers;
	}

	public static HttpHeaders getFormHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		return headers;
	}

	public static HttpEntity<String> getRequestEntity() {
		HttpEntity<String> formEntity = new HttpEntity<>(RestTemplateUtil.getHeaders());
		return formEntity;
	}

	public static HttpEntity<String> getRequestFormEntity() {
		HttpEntity<String> formEntity = new HttpEntity<>(RestTemplateUtil.getFormHeaders());
		return formEntity;
	}

	public static HttpEntity<String> getRequestEntity(String jsonPara) {
		HttpEntity<String> formEntity = new HttpEntity<>(jsonPara, RestTemplateUtil.getHeaders());
		return formEntity;
	}

	public static HttpEntity<String> getRequestFormEntity(String jsonPara) {
		HttpEntity<String> formEntity = new HttpEntity<>(jsonPara, RestTemplateUtil.getFormHeaders());
		return formEntity;
	}

	public static HttpEntity<MultiValueMap<String, String>> getRequestFormEntity(JSONObject jsonPara) {
		MultiValueMap<String, String> multiValueMap = createMultiValueMap(jsonPara);
		HttpEntity<MultiValueMap<String, String>> formEntity = new HttpEntity<>(multiValueMap, RestTemplateUtil.getFormHeaders());
		return formEntity;
	}

}
