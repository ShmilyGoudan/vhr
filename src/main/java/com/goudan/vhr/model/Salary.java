package com.goudan.vhr.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import lombok.Data;

@ApiModel(value="com-goudan-vhr-model-Salary")
@Data
public class Salary {
    @ApiModelProperty(value="")
    private Integer id;

    /**
    * 基本工资
    */
    @ApiModelProperty(value="基本工资")
    private Integer basicsalary;

    /**
    * 奖金
    */
    @ApiModelProperty(value="奖金")
    private Integer bonus;

    /**
    * 午餐补助
    */
    @ApiModelProperty(value="午餐补助")
    private Integer lunchsalary;

    /**
    * 交通补助
    */
    @ApiModelProperty(value="交通补助")
    private Integer trafficsalary;

    /**
    * 应发工资
    */
    @ApiModelProperty(value="应发工资")
    private Integer allsalary;

    /**
    * 养老金基数
    */
    @ApiModelProperty(value="养老金基数")
    private Integer pensionbase;

    /**
    * 养老金比率
    */
    @ApiModelProperty(value="养老金比率")
    private Double pensionper;

    /**
    * 启用时间
    */
    @ApiModelProperty(value="启用时间")
    private Date createdate;

    /**
    * 医疗基数
    */
    @ApiModelProperty(value="医疗基数")
    private Integer medicalbase;

    /**
    * 医疗保险比率
    */
    @ApiModelProperty(value="医疗保险比率")
    private Double medicalper;

    /**
    * 公积金基数
    */
    @ApiModelProperty(value="公积金基数")
    private Integer accumulationfundbase;

    /**
    * 公积金比率
    */
    @ApiModelProperty(value="公积金比率")
    private Double accumulationfundper;

    @ApiModelProperty(value="")
    private String name;
}