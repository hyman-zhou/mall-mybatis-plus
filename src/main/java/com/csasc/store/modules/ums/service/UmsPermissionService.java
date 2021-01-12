package com.csasc.store.modules.ums.service;

import com.csasc.store.modules.ums.model.UmsPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台用户权限表 服务类
 * </p>
 *
 * @author zhoupeng
 * @since 2021-01-12
 */
public interface UmsPermissionService extends IService<UmsPermission> {
    List<UmsPermission> listAllPermission();
    List<UmsPermission> getPermissionList(Long adminId);
}
