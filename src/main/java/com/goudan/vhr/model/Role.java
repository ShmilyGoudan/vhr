package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Role")
@Data
public class Role {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String name;

    /**
    * 角色名称
    */
    @ApiModelProperty(value="角色名称")
    private String namezh;
}