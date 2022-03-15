package com.shiqi.lirbarysystem.service.serviceimpl;

import com.shiqi.lirbarysystem.entity.User;
import com.shiqi.lirbarysystem.mapper.LoginMapper;
import com.shiqi.lirbarysystem.service.LoginSerevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginSerevice {
    @Autowired
    LoginMapper mapper;


    @Override
    public List<User> checklogin(String username, String password) {
        List list = mapper.checklogin(username,password);
        return list;
    }
}
