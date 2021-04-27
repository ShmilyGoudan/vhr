package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Menu")
@Data
public class Menu {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String url;

    @ApiModelProperty(value="")
    private String path;

    @ApiModelProperty(value="")
    private String component;

    @ApiModelProperty(value="")
    private String name;

    @ApiModelProperty(value="")
    private String iconcls;

    @ApiModelProperty(value="")
    private Boolean keepalive;

    @ApiModelProperty(value="")
    private Boolean requireauth;

    @ApiModelProperty(value="")
    private Integer parentid;

    @ApiModelProperty(value="")
    private Boolean enabled;
}