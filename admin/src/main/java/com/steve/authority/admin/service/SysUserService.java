package com.steve.authority.admin.service;

import com.steve.authority.admin.model.SysUser;
import com.steve.authority.core.service.CurdService;

import java.util.List;

public interface SysUserService extends CurdService<SysUser> {
    /**
     * 查找所有用户
     * @return
     */
    List<SysUser> findAll();
}
