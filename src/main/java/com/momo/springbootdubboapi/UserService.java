package com.momo.springbootdubboapi;/*
 * Copyright (C) 2017-2018 Qy All rights reserved
 * Author: Mo Qing Gen
 * Date: 2018/7/28
 * Description:UserService.java
 */

import com.momo.springbootdubboapi.po.User;

/**
 * 用户API
 *
 * @author Mo Qing Gen
 */
public interface UserService {

    void sayHello(String name);

    User findById(Integer id);
}
