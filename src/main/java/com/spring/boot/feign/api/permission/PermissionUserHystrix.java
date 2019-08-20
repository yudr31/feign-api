package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.PermissionUser;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-18 16:45:44
 */
public class PermissionUserHystrix extends BaseController implements PermissionUserClient {

    @Override
    public ResponseData<PageInfo<PermissionUser>> permissionUserPage(PermissionUser permissionUser) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<List<PermissionUser>> permissionUserList(PermissionUser permissionUser) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> addPermissionUser(PermissionUser permissionUser) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> updatePermissionUser(PermissionUser permissionUser) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<PermissionUser> permissionUserDetail(Long gid) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> removePermissionUser(Long gid) {
        return errorResponse("访问接口失败！");
    }
}
