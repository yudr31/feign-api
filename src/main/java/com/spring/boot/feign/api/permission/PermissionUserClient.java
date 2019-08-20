package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.PermissionUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:45:30
 */
@FeignClient(name = "permission", fallback = PermissionUserHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface PermissionUserClient {

    /**
     * 查询用户和角色的对应分页信息
     * @param permissionUser
     * @return
     */
    @RequestMapping("permissionUser/permissionUserPage")
    ResponseData<PageInfo<PermissionUser>> permissionUserPage(@RequestBody PermissionUser permissionUser);

    /**
     * 查询用户和角色的对应列表信息
     * @param permissionUser
     * @return
     */
    @RequestMapping("permissionUser/permissionUserList")
    ResponseData<List<PermissionUser>> permissionUserList(@RequestBody PermissionUser permissionUser);

    /**
     * 添加用户和角色的对应信息
     * @param permissionUser
     * @return
     */
    @RequestMapping("permissionUser/addPermissionUser")
    ResponseData<Integer> addPermissionUser(@RequestBody PermissionUser permissionUser);

    /**
     * 更新用户和角色的对应信息
     * @param permissionUser
     * @return
     */
    @RequestMapping("permissionUser/updatePermissionUser")
    ResponseData<Integer> updatePermissionUser(@RequestBody PermissionUser permissionUser);

    /**
     * 用户和角色的对应信息详情
     * @param gid
     * @return
     */
    @RequestMapping("permissionUser/permissionUserDetail")
    ResponseData<PermissionUser> permissionUserDetail(@RequestParam("gid") Long gid);

    /**
     * 删除用户和角色的对应信息
     * @param gid
     * @return
     */
    @RequestMapping("permissionUser/removePermissionUser")
    ResponseData<Integer> removePermissionUser(@RequestParam("gid") Long gid);

}
