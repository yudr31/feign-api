package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.PermissionResource;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:47:09
 */
public class PermissionResourceHystrix extends BaseController implements PermissionResourceClient {

    @Override
    public ResponseData<PageInfo<PermissionResource>> permissionResourcePage(PermissionResource permissionResource) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<List<PermissionResource>> permissionResourceList(PermissionResource permissionResource) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> addPermissionResource(PermissionResource permissionResource) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> updatePermissionResource(PermissionResource permissionResource) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<PermissionResource> permissionResourceDetail(Long gid) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> removePermissionResource(Long gid) {
        return errorResponse("访问接口失败！");
    }
}
