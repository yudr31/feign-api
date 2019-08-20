package com.spring.boot.feign.pojo.permission;

import com.spring.boot.common.annotation.validation.Validation;
import com.spring.boot.common.bean.BaseBean;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * @author yuderen
 * @version 2018/9/8 17:24
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class AdminInfo extends BaseBean {

    @Validation
    @ApiModelProperty(value = "用户名")
    private String userName;

    @Validation
    @ApiModelProperty(value = "加盐随机串。")
    private String saltRandom;

    @Validation
    @ApiModelProperty(value = "登录密码。")
    private String password;

    @Validation
    @ApiModelProperty(value = "用户头像地址。")
    private String avatar;

    @Validation
    @ApiModelProperty(value = "登录标识。0-未登录、1-已登录", example = "1")
    private Integer loginFlag;

    @Validation
    @ApiModelProperty(value = "登录次数。", example = "1")
    private Integer loginCount;

    @Validation
    @ApiModelProperty(value = "登录失败次数。登录成功后需置为0", example = "1")
    private Integer failCount;

    @Validation
    @ApiModelProperty(value = "锁定状态。0-不锁定，1-锁定（限制登录）", example = "1")
    private Integer lockStatus;

    @Validation
    @ApiModelProperty(value = "登录时间。[datetime]")
    private LocalDateTime loginTime;

}
