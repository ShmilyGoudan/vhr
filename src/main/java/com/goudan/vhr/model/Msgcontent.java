package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Msgcontent")
@Data
public class Msgcontent {
    @ApiModelProperty(value="")
    private Integer id;

    @ApiModelProperty(value="")
    private String title;

    @ApiModelProperty(value="")
    private String message;

    @ApiModelProperty(value="")
    private Date createdate;
}