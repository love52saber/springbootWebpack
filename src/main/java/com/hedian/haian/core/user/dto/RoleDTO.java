package com.hedian.haian.core.user.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * Created by Administrator on 2019/6/11 0011 19:42
 */
@Data
public class RoleDTO {
	/**
	 * 角色名
	 */
	@TableField("role_name")
	private String roleName;
	/**
	 * 角色编码
	 */
	@TableField("role_code")
	private String roleCode;
	/**
	 * 锁定标记: 0 不锁定 1 锁定
	 */
	@TableField("lock_flag")
	private Integer lockFlag;
	/**
	 * 角色类型 0:默认角色,1:企业角色,2:政府角色,3:后台管理角色
	 */
	@TableField("role_type")
	private Integer roleType;
	/**
	 * 系统标识:默认"0"
	 */
	@TableField("system_code")
	private String systemCode;


	/**
	 * 关联的用户id信息
	 */
	@TableField(exist = false)
	private String userId;

}
