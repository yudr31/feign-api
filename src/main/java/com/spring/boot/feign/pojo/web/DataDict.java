package com.spring.boot.feign.pojo.web;


import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DataDict extends BaseBean {

    @Validation(min = 1, max = 10)
    @ApiModelProperty(value = "字典项标签。")
    private String dictLabel;

    @Validation(min = 1, max = 10)
    @ApiModelProperty(value = "字典项值。")
    private String dictValue;

    @Validation
    @ApiModelProperty(value = "字典项类型。")
    private String dictType;

    @Validation
    @ApiModelProperty(value = "字典项父id。")
    private Long parent;

    @Validation
    @ApiModelProperty(value = "字典项描述。")
    private String description;

    @Validation
    @ApiModelProperty(value = "字典项描述。", example = "1")
    private Integer sort;

}
