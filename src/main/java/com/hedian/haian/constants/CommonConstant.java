package com.hedian.haian.constants;

/**

* @Description:    常用常量

* @Author:         winter

* @CreateDate:     2019-01-15 14:16

* @Version:        1.0

*/
public class CommonConstant {


    //redis 统一前缀
    public static final String REDIS_PREX = "JY_%s";

    //用户表示前缀
    public static final String USER_TOKEN_PREX = String.format(REDIS_PREX, "RISK_USER_TOKEN_%s");

    // 存储字典数据key
    public static final String REDIS_DICT_DATA = String.format(REDIS_PREX, "DICT_DATA");
//    public static final String REDIS_DICT_DATA = String.format(REDIS_PREX, "DICT_DATA_%s");

    //过期时间 60分钟 (单位是毫秒)
    public static final Integer EXPIRE_TIME = 6 * 60 * 60 * 1000;

    //JWT 过期时间与redis 保持一致
    public static final Integer JWT_EXPIRE_TIME = EXPIRE_TIME / 1000;

    //指定redis的库
    public static final Integer REDIS_INDEX = 0;

    //定义token header 头key
    public static final String AUTH_TOKEN_KAY = "Authorization";

    //默认编码
    public static final String DEFAULT_CHARSET = "utf-8";

    //服务错误返回code
    public static final String INTERNAL_ERROR_RESP_CODE = "20000";

    //服务业务成功返回code
    public static final String INTERNAL_SUCCESS_RESP_CODE = "10000";

    //服务业务失败返回code
    public static final String INTERNAL_FAIL_RESP_CODE = "40000";


    //上传文件默认文件夹
    public static final String PATH_UPLOAD_FOLDER = "/upload/";

    public static final String CO = "QAZWSXEDCRFVTGB";
}
