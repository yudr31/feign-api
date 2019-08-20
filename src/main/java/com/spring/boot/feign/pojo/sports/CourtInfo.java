package com.spring.boot.feign.pojo.sports;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CourtInfo extends BaseBean {

    @Validation
    @ApiModelProperty(value = "商户ID。")
    private String shopId;

    @Validation
    @ApiModelProperty(value = "预订日期。")
    private String bookDate;

    @Validation
    @ApiModelProperty(value = "星期几或周几。")
    private String weekDay;

    @Validation
    @ApiModelProperty(value = "价格。", example = "1")
    private Integer price;

    @Validation
    @ApiModelProperty(value = "开始时间。")
    private String startTime;

    @Validation
    @ApiModelProperty(value = "场地名称。")
    private String court;

    @Validation
    @ApiModelProperty(value = "时间区间。")
    private String timeInterval;

    @Validation
    @ApiModelProperty(value = "是否可预订。available-可预订，disable-不可预订")
    private String booking;

    @Validation
    @ApiModelProperty(value = "预订公共参数。")
    private String bookParam;

    @Validation
    @ApiModelProperty(value = "订单场次id。")
    private String groupIds;

    @Validation
    @ApiModelProperty(value = "场地相关信息。")
    private String content;

}