package com.spring.boot.feign.pojo.permission.vo;

import com.spring.boot.feign.pojo.permission.PermissionMenu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yuderen
 * @version 2019/7/10 9:03
 */
@Data
public class PermissionMenuVO extends PermissionMenu {

    @ApiModelProperty(value = "菜单权限。1-新增，2-删除，4-修改，8-查询")
    private Integer permission;

    private Integer state;

    @ApiModelProperty(value = "是否有当前菜单权限。true-有，false-没有")
    private Boolean checked;

    @ApiModelProperty(value = "子级菜单列表。")
    private List<PermissionMenuVO> children = new ArrayList();

}
