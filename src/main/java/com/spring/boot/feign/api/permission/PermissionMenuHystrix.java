package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.PermissionMenu;

import java.util.List;

/**
 * @author yuderen
 * @version 2019-7-17 16:29:47
 */
public class PermissionMenuHystrix extends BaseController implements PermissionMenuClient {

    @Override
    public ResponseData<PageInfo<PermissionMenu>> permissionMenuPage(PermissionMenu permissionMenu) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<List<PermissionMenu>> permissionMenuList(PermissionMenu permissionMenu) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> addPermissionMenu(PermissionMenu permissionMenu) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> updatePermissionMenu(PermissionMenu permissionMenu) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<PermissionMenu> permissionMenuDetail(Long gid) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> removePermissionMenu(Long gid) {
        return errorResponse("访问接口失败！");
    }
}
