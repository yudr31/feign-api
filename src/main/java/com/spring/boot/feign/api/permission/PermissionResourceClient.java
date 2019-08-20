package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.PermissionResource;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:46:56
 */
@FeignClient(name = "permission", fallback = PermissionResourceHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface PermissionResourceClient {

    /**
     * 查询角色和资源的对应分页信息
     * @param permissionResource
     * @return
     */
    @RequestMapping("permissionResource/permissionResourcePage")
    ResponseData<PageInfo<PermissionResource>> permissionResourcePage(@RequestBody PermissionResource permissionResource);

    /**
     * 查询角色和资源的对应列表信息
     * @param permissionResource
     * @return
     */
    @RequestMapping("permissionResource/permissionResourceList")
    ResponseData<List<PermissionResource>> permissionResourceList(@RequestBody PermissionResource permissionResource);

    /**
     * 添加角色和资源的对应信息
     * @param permissionResource
     * @return
     */
    @RequestMapping("permissionResource/addPermissionResource")
    ResponseData<Integer> addPermissionResource(@RequestBody PermissionResource permissionResource);

    /**
     * 更新角色和资源的对应信息
     * @param permissionResource
     * @return
     */
    @RequestMapping("permissionResource/updatePermissionResource")
    ResponseData<Integer> updatePermissionResource(@RequestBody PermissionResource permissionResource);

    /**
     * 角色和资源的对应信息详情
     * @param gid
     * @return
     */
    @RequestMapping("permissionResource/permissionResourceDetail")
    ResponseData<PermissionResource> permissionResourceDetail(@RequestParam("gid") Long gid);

    /**
     * 删除角色和资源的对应信息
     * @param gid
     * @return
     */
    @RequestMapping("permissionResource/removePermissionResource")
    ResponseData<Integer> removePermissionResource(@RequestParam("gid") Long gid);

}
