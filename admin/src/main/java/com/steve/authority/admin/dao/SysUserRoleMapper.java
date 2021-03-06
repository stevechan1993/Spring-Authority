package com.steve.authority.admin.dao;

import com.steve.authority.admin.model.SysUserRole;
import com.steve.authority.admin.model.SysUserRoleKey;

public interface SysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int deleteByPrimaryKey(SysUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insert(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int insertSelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    SysUserRole selectByPrimaryKey(SysUserRoleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKeySelective(SysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    int updateByPrimaryKey(SysUserRole record);
}