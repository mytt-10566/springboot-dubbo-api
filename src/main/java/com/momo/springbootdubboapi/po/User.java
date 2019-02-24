/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Mo Qing Gen
 * Date: 2018/7/28
 * Description:User.java
 */
package com.momo.springbootdubboapi.po;

import java.io.Serializable;

/**
 * 用户
 *
 * @author Mo Qing Gen
 */
public class User implements Serializable {

    private Integer id;
    private String username;
    private Integer gender;

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }
}
