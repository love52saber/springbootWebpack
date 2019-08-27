package com.hedian.haian.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/4/16 16:41
 */
@Data
public class ElementUITree<T> {

    @ApiModelProperty("id")
    private String id;

    @ApiModelProperty("value")
    private String value;

    @ApiModelProperty("节点标签")
    private String label;

    @ApiModelProperty("父节点标签")
    private String parentLabel;

    @ApiModelProperty("禁用标志位,true被禁用 false可用")
    private boolean disabled;

    @ApiModelProperty("叶子节点标志位,true是叶子 false不是叶子")
    private boolean isLeaf;

    @ApiModelProperty("子节点")
    private List<ElementUITree<T>> children = new ArrayList<>();

    @ApiModelProperty("父节点id")
    private String parentId;

    @ApiModelProperty("实体全部属性")
    private T beanAllAttrs;
}
