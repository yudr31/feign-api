package com.spring.boot.feign.pojo.web;


import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import lombok.Data;

/**
 * @author: yuderen
 * @version: 1.0 2017-9-16 23:15
 */
@Data
public class ModelConfig extends BaseBean {

    @Validation
    private String belongProject;

    @Validation
    private String modelName;

    @Validation
    private Integer modelType;

    @Validation
    private String savePath;

    @Validation
    private String fileName;

    @Validation
    private String modelContent;

}
