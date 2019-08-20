package com.spring.boot.feign.pojo.web;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import lombok.Data;

/**
 * @author yuderen
 * @version 2018/9/12 14:19
 */
@Data
public class DictType extends BaseBean {

    @Validation
    private String label;           // 标签类型名

    @Validation
    private String value;           // 标签类型值
    @Validation
    private String description;     // 描述

    @Validation
    private String scope;           // 适用范围

}
