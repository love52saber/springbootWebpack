package com.hedian.haian.core.user.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by Administrator on 2019/5/30 0030 14:32
 */
@ApiModel
@Data
public class UserQuery {

	@ApiModelProperty("企业id")
	private String enterId;

	@ApiModelProperty("企业姓名")
	private String name;
}
