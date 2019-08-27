package com.hedian.haian.security;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**

* @Description:    配置使用FastJson插件返回json数据

* @Author:         noahw

* @CreateDate:     2019-03-06 10:52

* @Version:        1.0

*/
public class FastJsonHttpMessageConverterEx extends FastJsonHttpMessageConverter {
    public FastJsonHttpMessageConverterEx() {
    }

    @Override
    protected boolean supports(Class<?> clazz) {
        return super.supports(clazz);
    }

}
