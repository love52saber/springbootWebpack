package com.hedian.haian.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * Description: 添加web配置
 *
 *implements WebMvcConfigurer ： 不会覆盖@EnableAutoConfiguration关于WebMvcAutoConfiguration的配置
 * @EnableWebMvc + implements WebMvcConfigurer ： 会覆盖@EnableAutoConfiguration关于WebMvcAutoConfiguration的配置
 * extends WebMvcConfigurationSupport ：会覆盖@EnableAutoConfiguration关于WebMvcAutoConfiguration的配置
 * extends DelegatingWebMvcConfiguration ：会覆盖@EnableAutoConfiguration关于WebMvcAutoConfiguration的配置
 * @param:
 * @return:
 * @auther: SuperWang
 * @date: 2019/3/13 17:16
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	/**
	 * 配置 可以跨域
	 * @param registry
	 */
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*")
				.allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
				.allowCredentials(true).maxAge(3600);
	}


	/**
	 * 配置静态资源访问
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		//1.需要定义一个convert转换消息的对象;
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		//2.添加fastJson的配置信息，比如：是否要格式化返回的json数据;
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteNullStringAsEmpty,
				SerializerFeature.DisableCircularReferenceDetect,
				SerializerFeature.WriteNullListAsEmpty,
				SerializerFeature.WriteDateUseDateFormat);
		//3处理中文乱码问题
		List<MediaType> fastMediaTypes = new ArrayList<>();
		fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
		//4.在convert中添加配置信息.
		fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		//5.将convert添加到converters当中.
		converters.add(fastJsonHttpMessageConverter);
		converters.add(new StringHttpMessageConverter());
	}

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter() {
        return new StringHttpMessageConverter(Charset.forName("utf8"));
    }
}
