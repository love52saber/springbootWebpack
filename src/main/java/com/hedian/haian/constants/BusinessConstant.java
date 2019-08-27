package com.hedian.haian.constants;

/**
 * @Author : jia
 * @Date : 2019/3/7
 * @Description : 业务数据常量类
 * @Version : 1.0
 */
public class BusinessConstant {
    //有效数据
    public static final int USE_TRUE = 1;
    //已删除数据
    public static final int USE_FALSE = 0;
    //可以删除
    public static final int DELETE_ENABLE = 1;
    //不可删除
    public static final int DELETE_DISABLE = 0;
    //实现对于模型数据的进行获取，现在模型是三条数据则生成三条数据
    public static final int MODEL_NUM = 3;

    //模拟用户ID数据
    public static final long TEST_CREATE_ID = 738119;
    public static final long TEST_MODIFIED_ID = 738119;

    /**
     * 风险等级包含上限标志
     */
    public static final Integer RISK_LEVEL_CONTAIN_UPPER_LIMIT_HAS = 1;
    public static final Integer RISK_LEVEL_CONTAIN_UPPER_LIMIT_NOT = 0;

    /**
     * 风险等级包含下限标志
     */
    public static final Integer RISK_LEVEL_CONTAIN_LOWER_LIMIT_HAS = 1;
    public static final Integer RISK_LEVEL_CONTAIN_LOWER_LIMIT_NOT = 0;

    /**
     * 是否被使用对于指标标记
     */
    public static final Integer QUTO_USED_FLAG = 1;
    public static final Integer QUTO_NOT_USED_FLAG = 0;

    /*0 普通用户 1 企业用户 2 基地*/
    public static final Integer USER_TYPE_ZERO =0;
    //目前当是企业用户的时候关联了企业的数据信息
    public static final Integer USER_TYPE_ONE =1;
    public static final Integer USER_TYPE_TWO =2;

    /**
     * 指标
     */
    //指标类型
    public static final Integer RISK_QUOTA_TYPE_BASE=1;
    public static final Integer RISK_QUOTA_TYPE_ENT=2;
    //与模型绑定(0未绑定1已绑定)
    public static final Integer RISK_QUOTA_MODEL_ASS_FLAG_ASSED=1;
    public static final Integer RISK_QUOTA_MODEL_ASS_FLAG_NOT=0;
    //指标状态
    public static final Integer RISK_QUOTA_QUOTA_STATUS_CHECKING=2;
    public static final Integer RISK_QUOTA_QUOTA_STATUS_CHECK_PASS=2;
    public static final Integer RISK_QUOTA_QUOTA_STATUS_CHECK_NOT_PASS=2;
    //操作
    public static final String RISK_QUOTA_OPT_EDIT="edit";
    public static final String RISK_QUOTA_OPT_TO_CHECK="submitToCheck";
    public static final String RISK_QUOTA_OPT_CHECK="check";
    /**
     * 指标检查实体
     */
    public static final Integer RISK_QUOTA_CHECK_CHECK_RESULT_PASS=1;
    public static final Integer RISK_QUOTA_CHECK_CHECK_RESULT_NOT_PASS=0;
    /**
     * 指标树
     */
    //指标等级
    public static final int QUOTA_TREE_QUOTA_LEVEL_ONE=1;
    public static final int QUOTA_TREE_QUOTA_LEVEL_TWO=2;
    public static final int QUOTA_TREE_QUOTA_LEVEL_THREE=3;
    public static final int QUOTA_TREE_QUOTA_LEVEL_FOUR=4;
    /**
     * 风险信息实体
     */
    //风险状态
    public static final Integer RISK_INFO_STATUS_NOT_CONTROL=1;
    public static final Integer RISK_INFO_STATUS_NOT_UPLOAD=2;
    public static final Integer RISK_INFO_STATUS_NOT_CHECK=3;
    public static final Integer RISK_INFO_STATUS_CHECK_PASS=4;
    public static final Integer RISK_INFO_STATUS_NOT_PASS=5;
    //风险分值类型
    public static final Integer RISK_QUOTA_SCORE_TYPE_FIXED = 1;
    public static final Integer RISK_QUOTA_SCORE_TYPE_DYN = 0;

    /**
     * 管控措施实体
     */
    //关联类型:1.指标;2.风险;3.作业
    public static final Integer CONTROL_MEASURE_RELATED_TYPE_QUOTA = 1;
    public static final Integer CONTROL_MEASURE_RELATED_TYPE_RISK = 2;
    public static final Integer CONTROL_MEASURE_RELATED_TYPE_WORK = 3;


    /**
     * 地理位置信息实体
     */
    //parentId
    public static final String SYS_AREA_PARENT_ID_PRIME = "0";

    /**
     * 检查项目实体
     */

    public static final Integer PROJECT_INFO_EFFECTIVE_FLAG_EFFECITIVE = 1;//当前有效标志位（1有效0失效）
    public static final Integer PROJECT_INFO_EFFECTIVE_FLAG_NOT_EFFECITIVE = 0;//当前有效标志位（1有效0失效）
    //检查间隔
    public static final Integer PROJECT_INFO_CHECK_COUNT_HOUR = 1;
    public static final Integer PROJECT_INFO_CHECK_COUNT_DAY = 2;
    public static final Integer PROJECT_INFO_CHECK_COUNT_WEEK = 3;
    public static final Integer PROJECT_INFO_CHECK_COUNT_MONTH = 4;
    public static final Integer PROJECT_INFO_CHECK_COUNT_SEASON = 5;
    public static final Integer PROJECT_INFO_CHECK_COUNT_HALF_YEAR = 6;
    public static final Integer PROJECT_INFO_CHECK_COUNT_YEAR = 7;
    public static final Integer PROJECT_INFO_CHECK_COUNT_TEMP = 8;
    //状态
    public static final Integer PROJECT_INFO_STATUS_ENABLE = 1;
    public static final Integer PROJECT_INFO_STATUS_DISABLE = 2;

    /**
     * 字典表
     */
    //字典name
    public static final String SYS_DICT_DICT_NAME_INDUSTRY= "industry";
    public static final String SYS_DICT_DICT_NAME_INDEX_ONE= "index_one";
    public static final String SYS_DICT_DICT_NAME_INDEX_TWO= "index_two";
    public static final String SYS_DICT_DICT_NAME_MANAGE_LEVEL= "control_top";
    public static final String SYS_DICT_DICT_NAME_SCOPE_TYPE= "score_type";
    public static final String SYS_DICT_DICT_NAME_SEND_MSG_URL= "send_msg_url";
    public static final String SYS_DICT_DICT_NAME_RISK_TYPE= "risk_type";

    //字典value
    public static final String SYS_DICT_DICT_VALUE_FIX_SCORE= "固定值";
    public static final String SYS_DICT_DICT_VALUE_DYN_SCORE= "动态值";
    /**
     * 类型统计表
     */
    //时间类别
    public static final String STATISTIC_TYPE_QUERY_TYPE_DAY = "0";
    public static final String STATISTIC_TYPE_QUERY_TYPE_WEEK = "1";
    public static final String STATISTIC_TYPE_QUERY_TYPE_MONTH = "2";
    public static final String STATISTIC_TYPE_QUERY_TYPE_SEASON = "3";
    public static final String STATISTIC_TYPE_QUERY_TYPE_CUSTOM = "4";
    public static final String STATISTIC_TYPE_QUERY_TYPE_YEAR = "5";

    /**
     * 风险等级
     */
    //风险名称值
    public static final String RISK_LEVEL_LEVEL_NAME_CODE_UNKNOWN = "0";
    public static final String RISK_LEVEL_LEVEL_NAME_CODE_MAJOR = "1";
    public static final String RISK_LEVEL_LEVEL_NAME_CODE_MORE = "2";
    public static final String RISK_LEVEL_LEVEL_NAME_CODE_COMMON = "3";
    public static final String RISK_LEVEL_LEVEL_NAME_CODE_LOW = "4";
    //风险名称
    public static final String RISK_LEVEL_LEVEL_NAME_VALUE_MAJOR = "重大风险";
    public static final String RISK_LEVEL_LEVEL_NAME_VALUE_MORE = "较大风险";
    public static final String RISK_LEVEL_LEVEL_NAME_VALUE_COMMON = "一般风险";
    public static final String RISK_LEVEL_LEVEL_NAME_VALUE_LOW = "低风险";
    public static final String RISK_LEVEL_LEVEL_NAME_VALUE_UNKNOWN = "低风险";
    //模型_VALUE

    /**
     * 检查任务
     */
    //检查任务状态
    public static final Integer TASK_INFO_STATUS_FIXED = 1;
    public static final Integer TASK_INFO_STATUS_NOT_FIXED = 0;

    /**
     * 检查结果
     */
    //检查结果
    public static final Integer TASK_RESULT_CHECK_RESULT_NOT_CHECK = 0;
    public static final Integer TASK_RESULT_CHECK_RESULT_PARTILLY_FIXED = 2;
    public static final Integer TASK_RESULT_CHECK_RESULT_FULL_FIXED = 1;
    public static final Integer TASK_RESULT_CHECK_RESULT_NOT_FIXED = 3;

    /**
     * 危险源信息
     */
    //评估日期状态 evaluate_time_status评估日期状态(1正常 2 即将过期 3已过期)
    public static final Integer DANGER_INFO_EVALUATE_TIME_STATUS_NORMAL = 1;
    public static final Integer DANGER_INFO_EVALUATE_TIME_STATUS_EXPIRING = 2;
    public static final Integer DANGER_INFO_EVALUATE_TIME_STATUS_EXPIRED = 3;

    /**
     * sysMsg 消息实体
     */
    //发布形式 pub_type
    public static final Integer SYS_MSG_PUB_TYPE_SMS = 1;
    public static final Integer SYS_MSG_PUB_TYPE_SYSTEM = 2;
    //业务类型 business_type
    public static final Integer SYS_MSG_BUSINESS_TYPE_WARNING_PUB = 1;//预警发布信息
    public static final Integer SYS_MSG_BUSINESS_TYPE_RISK_SOURCE = 2;//风险源提醒
    public static final Integer SYS_MSG_BUSINESS_TYPE_PLAN = 3;//应急预案
    //已读标志 has_read_flag
    public static final Integer SYS_MSG_HAS_READ_FLAG_NOT_READ= 0;//未读
    public static final Integer SYS_MSG_HAS_READ_FLAG_HAS_READ= 1;//已读
    //已清空标志 has_clear_flag
    public static final Integer SYS_MSG_HAS_CLEAR_FLAG_NOT_CLEAR= 0;//未清空
    public static final Integer SYS_MSG_HAS_CLEAR_FLAG_HAS_CLEAR= 1;//已清空


    /**
     * 定时任务实体
     */
    //任务状态
	public static final Integer STATUS_NORMAL = 1;
    public static final Integer STATUS_DISABLE = 0;

    /**
     * 角色实体
     */
    //role_code
    public static final String ROLE_ROLE_CODE_ENTER = "enter_risk";
    public static final String ROLE_ROLE_CODE_ADMIN = "admin_risk";
    public static final String ROLE_ROLE_CODE_BASE = "base_risk";

    /**
     * 用户实体
     */
    //角色id
    public static final Integer SYS_USER_ROLE_ID_ENTER = 1;
    public static final Integer SYS_USER_ROLE_ID_BASE = 2;


/*  每天凌晨1点执行一次：0 0 1 * * ?
    task.sysnc.org.time=0 0 1 * * */
    // 6个小时一次
    public static final String SYNC_ORG_TIME = "0 0 0/6 * * ?";
    public static final String SYNC_USER_TIME = "0 0 0/6 * * ?";

   // public static final String SYNC_USER_TIME = "0 0 2 * * ?";
    //public static final String SYNC_ORG_TIME = "0 0 1 * * ?";



    /**
     * 评估提醒设置实体danger_remind_setting
     */
    //send_frequency发送频率
    public static final Integer DANGER_REMIND_SETTING_SEND_FREQUENCY_ONE_DAY = 1;
    public static final Integer DANGER_REMIND_SETTING_SEND_FREQUENCY_THREE_DAY = 2;
    public static final Integer DANGER_REMIND_SETTING_SEND_FREQUENCY_WEEK_DAY = 3;
    public static final Integer DANGER_REMIND_SETTING_SEND_FREQUENCY_NEVER = 4;
    //
    public static final Integer DANGER_REMIND_SETTING_SETTING_TYPE_DANGER = 1;//危险源提醒
    public static final Integer DANGER_REMIND_SETTING_SETTING_TYPE_PLAN = 2;//源提醒
    public static final Integer DANGER_REMIND_SETTING_SETTING_TYPE_RISK_UPGRADE = 3;//风险升级提醒

    /**
     *实现对于公共基础平台数据实现对应的数据获取实现
     */
    public static  final  String    PLAT_FORM_NAME="JY-PLATFORM-MANAGER-SERVER";

    /**
     * 计算风险等级类型
     */
    //企业类型
    public static final Integer CALCU_RISK_TYPE_ENT = 1;
    //单元类型
    public static final Integer CALCU_RISK_TYPE_UNIT = 2;

    public static final Integer MESSAGE_STATUS_UNSEND = 0;

    public static final Integer MESSAGE_STATUS_SENDED = 1;

    public static final Integer MESSAGE_STATUS_SENDFAIL = 2;


    public  static  final String  NO_CHECK="0";
    public static final String  HAS_CHECK="1";
}
