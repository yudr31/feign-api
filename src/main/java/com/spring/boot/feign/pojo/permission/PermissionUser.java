package com.spring.boot.feign.pojo.permission;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yuderen
 * @version 2018/9/8 17:44
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class PermissionUser extends BaseBean {

    @Validation
    @ApiModelProperty(value = "角色所属的App类型。")
    private String appType;

    @Validation
    @ApiModelProperty(value = "用户ID。", example = "1")
    private Long userId;

    @Validation
    @ApiModelProperty(value = "用户名。")
    private String userName;

    @Validation
    @ApiModelProperty(value = "角色ID。", example = "1")
    private Long roleId;

    @Validation
    @ApiModelProperty(value = "角色名称。")
    private String roleName;

    @Validation
    @ApiModelProperty(value = "是否禁止该连接", example = "1")
    private Integer isDisabled;

}
