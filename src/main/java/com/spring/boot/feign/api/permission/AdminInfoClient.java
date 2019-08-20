package com.spring.boot.feign.api.permission;

import com.github.pagehelper.PageInfo;
import com.spring.boot.common.bean.ResponseData;
import com.spring.boot.feign.config.DefaultFeignConfiguration;
import com.spring.boot.feign.pojo.permission.AdminInfo;
import com.spring.boot.feign.pojo.permission.vo.LoginUserVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author yuderen
 * @version 2019/7/12 17:35
 */
@FeignClient(name = "permission", fallback = AdminInfoHystrix.class, configuration = DefaultFeignConfiguration.class)
public interface AdminInfoClient {

    /**
     * 系统用户登录接口
     * @param adminInfo
     * @return
     */
    @RequestMapping("adminInfo/login")
    ResponseData<LoginUserVO> login(@RequestBody AdminInfo adminInfo);

    /**
     * 查询系统用户分页信息
     * @param adminInfo
     * @return
     */
    @RequestMapping("adminInfo/adminInfoPage")
    ResponseData<PageInfo<AdminInfo>> adminInfoPage(@RequestBody AdminInfo adminInfo);

    /**
     * 查询系统用户列表信息
     * @param adminInfo
     * @return
     */
    @RequestMapping("adminInfo/adminInfoList")
    ResponseData<List<AdminInfo>> adminInfoList(@RequestBody AdminInfo adminInfo);

    /**
     * 添加系统用户信息
     * @param adminInfo
     * @return
     */
    @RequestMapping("adminInfo/addAdminInfo")
    ResponseData<Integer> addAdminInfo(@RequestBody AdminInfo adminInfo);

    /**
     * 更新系统用户信息
     * @param adminInfo
     * @return
     */
    @RequestMapping("adminInfo/updateAdminInfo")
    ResponseData<Integer> updateAdminInfo(@RequestBody AdminInfo adminInfo);

    /**
     * 系统用户信息详情
     * @param gid
     * @return
     */
    @RequestMapping("adminInfo/adminInfoDetail")
    ResponseData<AdminInfo> adminInfoDetail(@RequestParam("gid") Long gid);

    /**
     * 删除系统用户信息
     * @param gid
     * @return
     */
    @RequestMapping("adminInfo/removeAdminInfo")
    ResponseData<Integer> removeAdminInfo(@RequestParam("gid") Long gid);

}
