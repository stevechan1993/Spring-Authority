package com.steve.authority.admin.service.impl;

import com.steve.authority.admin.dao.SysUserMapper;
import com.steve.authority.admin.model.SysUser;
import com.steve.authority.admin.service.SysUserService;

import com.steve.authority.core.page.MybatisPageHelper;
import com.steve.authority.core.page.PageRequest;
import com.steve.authority.core.page.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> findAll() {
        return sysUserMapper.findAll();
    }

    @Override
    public int save(SysUser record) {
        return 0;
    }

    @Override
    public int delete(SysUser record) {
        return 0;
    }

    @Override
    public int delete(List<SysUser> record) {
        return 0;
    }

    @Override
    public SysUser findById(Long id) {
        return null;
    }

    @Override
    public PageResult findPage(PageRequest pageRequest) {
        return MybatisPageHelper.findPage(pageRequest, sysUserMapper);
    }
}
