package com.hedian.haian.core.user.dto;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2019/6/11 0011 17:18
 */
@Data
public class UserDTO {
	private static final long serialVersionUID = 1L;

	/**
	 * ID
	 */
	@TableId(value = "id", type = IdType.ID_WORKER)
	private String id;

	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 用户名
	 */
	@TableField("user_name")
	private String userName;
	/**
	 * 用户姓名
	 */
	@TableField("real_name")
	private String realName;
	/**
	 * 所属部门ID
	 */
	@TableField("dept_id")
	private String deptId;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 手机号
	 */
	@TableField("phone_num")
	private String phoneNum;
	/**
	 * 固定电话
	 */
	@TableField("fixed_phone")
	private String fixedPhone;
	/**
	 * 身份证号码
	 */
	@TableField("identity_card")
	private String identityCard;
	/**
	 * 用户性别 0:男 1:女
	 */
	@TableField("user_sex")
	private Integer userSex;
	/**
	 * 账户类型 0:默认用户,1:企业用户,2:政府用户,3:后台管理用户
	 */
	@TableField("account_type")
	private Integer accountType;
	/**
	 * 用户名或密码输入错误时间
	 */
	@TableField("last_wrong_time")
	private Date lastWrongTime;
	/**
	 * 在laswrong_time和当前时间相差30分钟内输入错误次数
	 */
	@TableField("wrong_times")
	private Integer wrongTimes;
	/**
	 * 锁定类型: 0 未锁定 1:自动锁定 2:手动锁定
	 */
	@TableField("lock_type")
	private Integer lockType;
	/**
	 * 锁定标记: 0 不锁定 1 锁定 当前设计输入密码5次错误，锁定30分钟
	 */
	@TableField("lock_flag")
	private Integer lockFlag;
	/**
	 * 解锁时间，开始锁定时间+锁定时长=解锁时间，在验证解锁时间到达之后同时需要更新lockflag为解锁状态以及将锁定原因清空
	 */
	@TableField("unlock_time")
	private Date unlockTime;
	/**
	 * 被锁定原因
	 */
	@TableField("lock_reason")
	private String lockReason;
	/**
	 * 是否过期 0:未过期,1:已过期
	 */
	private Integer expired;
	/**
	 * 系统标识:默认为0
	 */
	@TableField("system_code")
	private String systemCode;
	/**
	 * 创建者的用户ID
	 */
	@TableField(value = "create_id", fill = FieldFill.INSERT)
	private String createId;
	/**
	 * 修改者的用户ID
	 */
	@TableField(value = "modified_id", fill = FieldFill.UPDATE)
	private String modifiedId;
	/**
	 * 创建时间
	 */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private Date createTime;
	/**
	 * 修改时间
	 */
	@TableField(value = "modified_time", fill = FieldFill.UPDATE)
	private Date modifiedTime;
	/**
	 * 备注
	 */
	private String comment;
	/**
	 * 是否可以被删除，0不能被删除，1可被删除，默认为1
	 */
	@TableField(value = "del_flag", fill = FieldFill.INSERT)
	private Integer delFlag;
	/**
	 * 是否有效数据，0无效（被删除），1有效
	 */
	@TableField(value = "use_flag", fill = FieldFill.INSERT)
	@TableLogic
	private Integer useFlag;

	@ApiModelProperty("角色信息列表")
	private List<RoleDTO> role;

	@ApiModelProperty("角色信息列表")
	private Boolean usedForMsgFlag;

	private String tel;

	private String enterId;

	private String name;

	/**
	 * 用户别名
	 */
	private  String userAlias;

	/**
	 * 盐都企业的数据id
	 */
	private String entprInfoId;




}
