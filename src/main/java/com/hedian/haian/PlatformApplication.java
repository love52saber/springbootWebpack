package com.hedian.haian;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.hedian.haian.util.ApplicationContextUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

/**

* @Description:    Springboot工程 启动入口

* @Author:         noahw

* @CreateDate:     2019-01-11 9:48

* @Version:        1.0.1

*/
@SpringBootApplication
@MapperScan({"com.hedian.platform.core.*.persistence.mapper",
             "com.hedian.platform.customer.*.persistence.mapper"})
@EnableCaching
@EnableFeignClients
@EnableScheduling
@EnableEurekaClient
@EnableAutoConfiguration(exclude={DruidDataSourceAutoConfigure.class})
//@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class PlatformApplication{

    public static void main(String[] args) {
       ApplicationContext context=(ApplicationContext) SpringApplication.run(PlatformApplication.class, args);
       ApplicationContextUtil.setContext(context);
    }
}

