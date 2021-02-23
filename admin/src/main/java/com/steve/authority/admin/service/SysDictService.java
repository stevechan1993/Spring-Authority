package com.steve.authority.admin.service;

import com.steve.authority.admin.model.SysDict;
import com.steve.authority.core.service.CurdService;

import java.util.List;

/**
 * 字典管理
 * @author Steve
 * @data  Aug 04, 2020
 */
public interface SysDictService  extends CurdService<SysDict> {
    /**
     * 根据名称查询
     * @param label
     * @return
     */
    List<SysDict> findByLabel(String label);
}
