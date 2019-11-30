package com.aesjourney.dubbo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @ClassName: UserInfo
 * @Description: TODO
 * @Author: ZhangChen
 * @Date: 2019/11/30 21:22
 **/
@Entity
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    @Column
    String username;
    @Column
    String password;
    @Column
    String realName;
    @Column
    String mobile;
    @Column
    String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmai() {
        return email;
    }

    public void setEmai(String emai) {
        this.email = emai;
    }
}
