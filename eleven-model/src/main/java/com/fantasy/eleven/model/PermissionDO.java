package com.fantasy.eleven.model;

import java.util.Date;

/**
 * Created by Fantasy on 2018/1/21.
 *
 * @author Fantasy
 */
public class PermissionDO {
    private Integer id;
    private String permissionName;
    private Integer roleId;
    private Date gmtCreate;
    private Date gmtModified;
    private String permissionDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public String getPermissionDesc() {
        return permissionDesc;
    }

    public void setPermissionDesc(String permissionDesc) {
        this.permissionDesc = permissionDesc;
    }

    @Override
    public String toString() {
        return "PermissionDO{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", roleId=" + roleId +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", permissionDesc='" + permissionDesc + '\'' +
                '}';
    }
}
