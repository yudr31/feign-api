package com.spring.boot.feign.pojo.web;


import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class MappingField extends BaseBean {

    @Validation
    @ApiModelProperty(value = "所属项目。")
    private String belongProject;

    @Validation
    @ApiModelProperty(value = "表列类型。")
    private String columnType;

    @Validation
    @ApiModelProperty(value = "属性类型。")
    private String fieldType;

    @Validation
    @ApiModelProperty(value = "判断条件。")
    private String mappingCondition;

}