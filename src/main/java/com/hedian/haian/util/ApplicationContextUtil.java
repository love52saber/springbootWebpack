package com.hedian.haian.util;

import org.springframework.context.ApplicationContext;

public class ApplicationContextUtil {

    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        return context;
    }

    public static void setContext(ApplicationContext context) {
        ApplicationContextUtil.context = context;
    }

    public  static  Object getBean(String beanName){
        return context.getBean(beanName);
    }

    public  static<T>  T getBean(Class<T> className){
        return context.getBean(className);
    }

    public  static  <T>  T getBean(String beanName,Class<T> className){
        return context.getBean(beanName,className);
    }

}
