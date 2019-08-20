package com.spring.boot.feign.pojo.permission;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yuderen
 * @version 2018/9/8 17:32
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionRole extends BaseBean {

    @Validation
    @ApiModelProperty(value = "角色所属的App类型。")
    private String appType;

    @Validation
    @ApiModelProperty(value = "角色类型，例如超级管理员、系统定义角色、自定义角色。", example = "1")
    private Integer roleType;

    @Validation
    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @Validation
    @ApiModelProperty(value = "角色描述")
    private String roleDesc;

    @Validation
    @ApiModelProperty(value = "角色使用的优先级，当角色的权限有冲突时，使用该优先级", example = "1")
    private Integer priority;

}
