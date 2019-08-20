package com.spring.boot.feign.pojo.permission.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author yuderen
 * @version 2019/7/23 10:06
 */
@Data
public class LoginUserVO {

    @ApiModelProperty(value = "用户Id。")
    private Long userId;

    @ApiModelProperty(value = "用户名称。")
    private String userName;

    @ApiModelProperty(value = "是否已登录。")
    private Boolean isLogined;

    @ApiModelProperty(value = "是否是admin角色。")
    private Boolean isAdminRole;

    @ApiModelProperty(value = "登录token。")
    private String token;

}
