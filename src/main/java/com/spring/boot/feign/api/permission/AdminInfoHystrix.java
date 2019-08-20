package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.AdminInfo;
import com.spring.boot.feign.pojo.permission.vo.LoginUserVO;

import java.util.List;

/**
 * @author yuderen
 * @version 2019/7/12 17:37
 */
public class AdminInfoHystrix extends BaseController implements AdminInfoClient {

    @Override
    public ResponseData<LoginUserVO> login(AdminInfo adminInfo) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<PageInfo<AdminInfo>> adminInfoPage(AdminInfo adminInfo) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<List<AdminInfo>> adminInfoList(AdminInfo adminInfo) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> addAdminInfo(AdminInfo adminInfo) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> updateAdminInfo(AdminInfo adminInfo) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<AdminInfo> adminInfoDetail(Long gid) {
        return errorResponse("访问接口失败！");
    }

    @Override
    public ResponseData<Integer> removeAdminInfo(Long gid) {
        return errorResponse("访问接口失败！");
    }
}
