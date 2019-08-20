package com.spring.boot.feign.api.permission;

import com.spring.boot.common.bean.BaseController;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.pojo.permission.vo.PermissionMenuVO;

import java.util.List;

/**
 * @author yuderen
 * @version 2019/7/23 10:53
 */
public class PermissionInfoHystrix extends BaseController implements PermissionInfoClient {

    @Override
    public ResponseData<List<PermissionMenuVO>> fetchPermissionMenuList(Long userId) {
        return errorResponse("访问接口失败！");
    }
}
