package com.goudan.vhr.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Program vhr
 * @Author Goudan
 * @Date 2021/4/28 14:29
 * @Description
 * @Version 1.0
 */
@Data
public class Meta {
    /**
     *
     */
    @ApiModelProperty(value = "")
    private Boolean keepalive;

    /**
     *
     */
    @ApiModelProperty(value = "")
    private Boolean requireauth;
}
