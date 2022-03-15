package com.shiqi.lirbarysystem.service;


import com.shiqi.lirbarysystem.entity.User;

import java.util.List;

public interface LoginSerevice {

    //检查登录
    List<User> checklogin(String username, String password);

}
