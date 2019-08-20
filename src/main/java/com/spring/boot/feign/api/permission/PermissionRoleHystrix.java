package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.PermissionRole;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:42:54
 */
public class PermissionRoleHystrix extends BaseController implements PermissionRoleClient {

    @Override
    public ResponseData<PageInfo<PermissionRole>> permissionRolePage(PermissionRole permissionRole) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<List<PermissionRole>> permissionRoleList(PermissionRole permissionRole) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> addPermissionRole(PermissionRole permissionRole) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> updatePermissionRole(PermissionRole permissionRole) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<PermissionRole> permissionRoleDetail(Long gid) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> removePermissionRole(Long gid) {
        return errorResponse("访问接口失败！");
    }
}
