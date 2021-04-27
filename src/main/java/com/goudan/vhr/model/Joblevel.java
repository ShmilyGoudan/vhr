package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Joblevel")
@Data
public class Joblevel {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 职称名称
    */
    @ApiModelProperty(value="职称名称")
    private String name;

    @ApiModelProperty(value="")
    private Object titlelevel;

    @ApiModelProperty(value="")
    private Date createdate;

    @ApiModelProperty(value="")
    private Boolean enabled;
}