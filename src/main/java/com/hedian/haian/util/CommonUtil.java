package com.hedian.haian.util;

import com.hedian.haian.base.BaseResult;
import com.hedian.haian.constants.CommonConstant;

import java.util.Collection;
import java.util.Map;

/**
 * @Description: 通用工具类
 * @Author: noahw
 * @CreateDate: 2019-01-14 13:25
 * @Version: 1.0
 */
public class CommonUtil {

    public static BaseResult initErrorResult(String desc) {
        return new BaseResult(CommonConstant.INTERNAL_ERROR_RESP_CODE, desc);
    }

    public static void updateErrorResult(BaseResult result, String desc) {
        result.setResultCode(CommonConstant.INTERNAL_ERROR_RESP_CODE);
        result.setDesc(desc);
    }

    public static void updateFailResult(BaseResult result, String desc) {
        result.setResultCode(CommonConstant.INTERNAL_FAIL_RESP_CODE);
        result.setDesc(desc);
    }

    public static boolean isEmptyList(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmptyList(Collection<?> collection) {
        return !(collection == null || collection.isEmpty());
    }

    public static boolean isEmptyMap(Map<?, ?> map) {
        return map == null || isEmptyList(map.keySet());
    }

    public static boolean isNotEmptyMap(Map<?, ?> map) {
        return !(map == null || isEmptyList(map.keySet()));
    }

}
