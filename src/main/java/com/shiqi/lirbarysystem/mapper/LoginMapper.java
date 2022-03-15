package com.shiqi.lirbarysystem.mapper;

import com.shiqi.lirbarysystem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    //检查登录
    List<User> checklogin(String username, String password);
}
