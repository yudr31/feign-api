package com.spring.boot.feign.api.permission;

import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.vo.PermissionMenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019/7/23 10:52
 */
@FeignClient(name = "permission", fallback = PermissionInfoHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface PermissionInfoClient {

    @RequestMapping("permission/fetchPermissionMenuList")
    ResponseData<List<PermissionMenuVO>> fetchPermissionMenuList(@RequestParam("userId") Long userId);

}
