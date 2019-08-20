package com.spring.boot.feign.pojo.permission;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yuderen
 * @version 2018/9/8 17:36
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionMenu extends BaseBean {

    @Validation
    @ApiModelProperty(value = "角色所属的App类型。")
    private String appType;

    @Validation
    @ApiModelProperty(value = "菜单类型。", example = "1")
    private Integer menuType;

    @Validation
    @ApiModelProperty(value = "菜单名称。")
    private String menuName;

    @Validation
    @ApiModelProperty(value = "菜单描述。")
    private String menuDesc;

    @Validation
    @ApiModelProperty(value = "菜单父ID。[globalId]", example = "1")
    private Long parentId;

    @Validation
    @ApiModelProperty(value = "菜单链接。")
    private String menuLink;

    @Validation
    @ApiModelProperty(value = "菜单序号。")
    private String sort;

}
