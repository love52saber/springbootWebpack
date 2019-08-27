package com.hedian.haian.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MetaObjectHandlerConfig implements MetaObjectHandler {

    private static Logger logger = LoggerFactory.getLogger(MetaObjectHandlerConfig.class);

    @Override
    public void insertFill(MetaObject metaObject) {
        logger.info("插入方法实体填充");
        Object delFlag = getFieldValByName("delFlag", metaObject);
        Object useFlag = getFieldValByName("useFlag", metaObject);
        Object createId = getFieldValByName("createId", metaObject);
        Object createTime = getFieldValByName("createTime", metaObject);
        if (delFlag == null) {
            setFieldValByName("delFlag", 1, metaObject);
        }
        if (useFlag == null) {
            setFieldValByName("useFlag", 1, metaObject);
        }
        if (createTime == null) {
            setFieldValByName("createTime", new Date(), metaObject);
        }
    }


    @Override
    public void updateFill(MetaObject metaObject) {
        logger.info("更新方法实体填充");
        Object modifiedId = getFieldValByName("modifiedId", metaObject);
        Object modifiedTime = getFieldValByName("modifiedTime", metaObject);
        if (modifiedTime == null) {
            setFieldValByName("modifiedTime", new Date(), metaObject);
        }
    }



}
