package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.PermissionRole;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:42:37
 */
@FeignClient(name = "permission", fallback = PermissionRoleHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface PermissionRoleClient {

    /**
     * 查询用户权限模块的角色分页信息
     * @param permissionRole
     * @return
     */
    @RequestMapping("permissionRole/permissionRolePage")
    ResponseData<PageInfo<PermissionRole>> permissionRolePage(@RequestBody PermissionRole permissionRole);

    /**
     * 查询用户权限模块的角色列表信息
     * @param permissionRole
     * @return
     */
    @RequestMapping("permissionRole/permissionRoleList")
    ResponseData<List<PermissionRole>> permissionRoleList(@RequestBody PermissionRole permissionRole);

    /**
     * 添加用户权限模块的角色信息
     * @param permissionRole
     * @return
     */
    @RequestMapping("permissionRole/addPermissionRole")
    ResponseData<Integer> addPermissionRole(@RequestBody PermissionRole permissionRole);

    /**
     * 更新用户权限模块的角色信息
     * @param permissionRole
     * @return
     */
    @RequestMapping("permissionRole/updatePermissionRole")
    ResponseData<Integer> updatePermissionRole(@RequestBody PermissionRole permissionRole);

    /**
     * 用户权限模块的角色信息详情
     * @param gid
     * @return
     */
    @RequestMapping("permissionRole/permissionRoleDetail")
    ResponseData<PermissionRole> permissionRoleDetail(@RequestParam("gid") Long gid);

    /**
     * 删除用户权限模块的角色信息
     * @param gid
     * @return
     */
    @RequestMapping("permissionRole/removePermissionRole")
    ResponseData<Integer> removePermissionRole(@RequestParam("gid") Long gid);

}
