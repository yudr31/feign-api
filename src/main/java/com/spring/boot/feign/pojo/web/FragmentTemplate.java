package com.spring.boot.feign.pojo.web;


import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import lombok.Data;


/**
 * @author yuderen
 * @version 2017/10/26 16:34
 */
@Data
public class FragmentTemplate extends BaseBean {

    @Validation
    private String modelName;           //碎片模板名称

    @Validation
    private Integer modelType;          //碎片模板类型

    @Validation
    private String modelDesc;           //碎片模板描述

    @Validation
    private String modelContent;

}
