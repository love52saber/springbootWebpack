package com.hedian.haian.exception;

/**

* @Description:    服务端内部业务异常

* @Author:         noahw

* @CreateDate:     2019-01-11 9:40

* @Version:        1.0.1

*/
public class BusinessException extends RuntimeException{

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException() {
    }
}
