package com.shiqi.lirbarysystem.urlcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/shiqi")
public class BookControllerUrl {


    @GetMapping("/fen")
    public String fen(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("获取的id："+id);
        return "/fenlei";
    }

    @GetMapping("/toupdate2")
    public String toupdate(HttpServletRequest request){

        int id = Integer.parseInt(request.getParameter("id"));
        System.out.println("获取需要修改的id："+id);
        return "/Bupdate";
    }

    @GetMapping("/toinsert")
    public String  insert(){
        System.out.println("进入添加 页面 ");

        return "/insert";

    }



}
