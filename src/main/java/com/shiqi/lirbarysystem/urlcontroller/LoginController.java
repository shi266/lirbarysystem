package com.shiqi.lirbarysystem.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/shiqi")
public class LoginController {
    //进入登录页面
    @GetMapping("/login")
    public String login(){
        System.out.println("进入登录页面");
        return "/login";
    }
    //进入主页面
    @GetMapping("/index")
    public String index(){
        System.out.println("进入主页面");
        return "/index";
    }
//    //进入主页面
//    @GetMapping("/fen")
//    public String fen(HttpServletRequest request){
//
//        int id = Integer.parseInt(request.getParameter("id"));
//        System.out.println("获取的id："+id);
////        return "/fenlei?id="+id+"";
//        return "/fenlei";
//    }

}
