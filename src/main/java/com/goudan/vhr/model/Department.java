package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Department")
@Data
public class Department {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 部门名称
    */
    @ApiModelProperty(value="部门名称")
    private String name;

    @ApiModelProperty(value="")
    private Integer parentid;

    @ApiModelProperty(value="")
    private String deppath;

    @ApiModelProperty(value="")
    private Boolean enabled;

    @ApiModelProperty(value="")
    private Boolean isparent;
}