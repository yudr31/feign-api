package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.PermissionMenu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-17 16:16:25
 */
@FeignClient(name = "permission", fallback = PermissionMenuHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface PermissionMenuClient {

    /**
     * 查询用户权限模块的资源分页信息
     * @param permissionMenu
     * @return
     */
    @RequestMapping("permissionMenu/permissionMenuPage")
    ResponseData<PageInfo<PermissionMenu>> permissionMenuPage(@RequestBody PermissionMenu permissionMenu);

    /**
     * 查询用户权限模块的资源列表信息
     * @param permissionMenu
     * @return
     */
    @RequestMapping("permissionMenu/permissionMenuList")
    ResponseData<List<PermissionMenu>> permissionMenuList(@RequestBody PermissionMenu permissionMenu);

    /**
     * 添加用户权限模块的资源信息
     * @param permissionMenu
     * @return
     */
    @RequestMapping("permissionMenu/addPermissionMenu")
    ResponseData<Integer> addPermissionMenu(@RequestBody PermissionMenu permissionMenu);

    /**
     * 更新用户权限模块的资源信息
     * @param permissionMenu
     * @return
     */
    @RequestMapping("permissionMenu/updatePermissionMenu")
    ResponseData<Integer> updatePermissionMenu(@RequestBody PermissionMenu permissionMenu);

    /**
     * 用户权限模块的资源信息详情
     * @param gid
     * @return
     */
    @RequestMapping("permissionMenu/permissionMenuDetail")
    ResponseData<PermissionMenu> permissionMenuDetail(@RequestParam("gid")Long gid);

    /**
     * 删除用户权限模块的资源信息
     * @param gid
     * @return
     */
    @RequestMapping("permissionMenu/removePermissionMenu")
    ResponseData<Integer> removePermissionMenu(@RequestParam("gid") Long gid);

}
