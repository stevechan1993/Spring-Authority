package com.steve.authority.admin.model;

import java.util.Date;

public class SysDept extends SysDeptKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.name
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.parent_id
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private Long parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.order_num
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private Integer orderNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.create_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private String lastUpdateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.last_update_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private Date lastUpdateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dept.del_flag
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    private Byte delFlag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.name
     *
     * @return the value of sys_dept.name
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.name
     *
     * @param name the value for sys_dept.name
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.parent_id
     *
     * @return the value of sys_dept.parent_id
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.parent_id
     *
     * @param parentId the value for sys_dept.parent_id
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.order_num
     *
     * @return the value of sys_dept.order_num
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public Integer getOrderNum() {
        return orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.order_num
     *
     * @param orderNum the value for sys_dept.order_num
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_by
     *
     * @return the value of sys_dept.create_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_by
     *
     * @param createBy the value for sys_dept.create_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.create_time
     *
     * @return the value of sys_dept.create_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.create_time
     *
     * @param createTime the value for sys_dept.create_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_by
     *
     * @return the value of sys_dept.last_update_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_by
     *
     * @param lastUpdateBy the value for sys_dept.last_update_by
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.last_update_time
     *
     * @return the value of sys_dept.last_update_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.last_update_time
     *
     * @param lastUpdateTime the value for sys_dept.last_update_time
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dept.del_flag
     *
     * @return the value of sys_dept.del_flag
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dept.del_flag
     *
     * @param delFlag the value for sys_dept.del_flag
     *
     * @mbg.generated Sun Jul 05 10:44:23 CST 2020
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}