package com.spring.boot.feign.pojo.permission;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yuderen
 * @version 2019/7/9 18:08
 */
@Data
public class PermissionResource extends BaseBean {

    @Validation
    @ApiModelProperty(value = "角色所属的App类型。")
    private String appType;

    @Validation
    @ApiModelProperty(value = "拥有者的主体类型。")
    private String subjectType;

    @Validation
    @ApiModelProperty(value = "主体ID。（可以是用户ID，角色ID）", example = "1")
    private Long subjectId;

    @Validation
    @ApiModelProperty(value = "主体名称。（可以是用户ID，角色ID）")
    private String subjectName;

    @Validation
    @ApiModelProperty(value = "菜单ID。[globalId]", example = "1")
    private Long menuId;

    @Validation
    @ApiModelProperty(value = "菜单名称。")
    private String menuName;

    @Validation
    @ApiModelProperty(value = "菜单权限（1-15数值，利用二进制与或计算方法计算）。1-查询，2-添加，4-修改，8-删除", example = "1")
    private Integer permission;

    @Validation
    @ApiModelProperty(value = "是否黑名单，即禁止访问", example = "1")
    private Integer isForbidden;

    @Validation
    @ApiModelProperty(value = "是否禁止该连接", example = "1")
    private Integer isDisabled;

}
