package com.shiqi.lirbarysystem.textcontroller;

import com.shiqi.lirbarysystem.mapper.LoginMapper;

import com.shiqi.lirbarysystem.service.LoginSerevice;
import com.shiqi.lirbarysystem.service.serviceimpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/shiqi")
public class CheckLogin {
@Autowired
    LoginServiceImpl service;
@Autowired
LoginMapper mapper;
    //检查啊登录
    @GetMapping("/checklogin")
    public String checklogin(@RequestParam Map map, HttpServletRequest request){
        System.out.println("登录检查");
        String username  = request.getParameter("username");
        String password  = request.getParameter("password");
//        String username = (String) map.get("username");
//        String password = (String) map.get("password");
        System.out.println("user:" + username);
        System.out.println("pwd:" + password);
        List i = service.checklogin(username, password);
        System.out.println("list的大小："+i);
        if (i.size()!= 0) {
            System.out.println("登陆成功");
            return "success";
        } else {
            System.out.println("登陆失败");
            return "fail";
        }
    }

}
