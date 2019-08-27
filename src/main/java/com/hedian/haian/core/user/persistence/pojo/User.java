package com.hedian.haian.core.user.persistence.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**

* @Description:    用户POJO

* @Author:         noahw

* @CreateDate:     2019-01-11 9:41

* @Version:        1.0

*/
@Data
@TableName("data_user")
public class User extends Model<User> {

    @TableId(value = "id", type = IdType.UUID)
    private String id;

    @TableField(value = "del_flag",fill = FieldFill.INSERT)
    private Integer delFlag;

    @TableField("user_name")
    private String userName;

    @TableField("real_name")
    private String realName;

    @JsonIgnore
    @TableField("password")
    private String password;

    @TableField("role_id")
    private Integer roleId;

    @ApiModelProperty("以为信息接收人标志位(0不是信息接收人 1是信息接收人)")
    @TableField("used_for_msg_flag")
    private Integer usedForMsgFlag;

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
     * 企业id
     */
    @TableField("enter_id")
    private String enterId;

    @TableField(value = "use_flag",fill = FieldFill.INSERT)
    @TableLogic
    private Integer useFlag;

    @TableField(value = "create_id", fill = FieldFill.INSERT)
    private String createId;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    @JsonFormat( pattern = "yyyy-MM-dd HH-mm-ss")
    private Date createTime;

    @TableField(value = "modified_id", fill = FieldFill.INSERT)
    private String modifiedId;

    @TableField(value = "modified_time", fill = FieldFill.INSERT_UPDATE)
    private Date modifiedTime;

    @Override
    protected Serializable pkVal() {
        return id;
    }


}
