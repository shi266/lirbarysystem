package com.shiqi.lirbarysystem.textcontroller;

import com.google.gson.Gson;
import com.shiqi.lirbarysystem.entity.Jilu;
import com.shiqi.lirbarysystem.service.serviceimpl.JishuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/shiqi")
public class JiluController {

    @Autowired
    JishuServiceImpl service;
    /*借书记录添加*/
    @GetMapping("/jieshujilu")
    public String jieshujilu(HttpServletRequest request){
        System.out.println("进行借书记录登记");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = df.format(new Date());// new Date()为获取当前系统时间

        String bname = request.getParameter("jsbname");
        String jssname = request.getParameter("jssname");
        long jssid = Long.parseLong(request.getParameter("jssid"));
        String jsstatus = request.getParameter("jsstatus");

        Jilu jl = new Jilu(0,bname,jssname,jssid,time,jsstatus);
        System.out.println("  "+bname+" "+jssname+" "+jssid+" "+jsstatus+" ");
        int i = service.insertjieshu(jl);
        System.out.println("是否记录成功："+i);
        if(i!=0){
            System.out.println("记录成功");
            return "success";
        }else {
            System.out.println("记录失败");
            return "fail";
        }
    }
    /*还书记录添加*/
    @GetMapping("/huanshujilu")
    public String huanshujilu(HttpServletRequest request){
        System.out.println("进行还书记录登记");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String time = df.format(new Date());// new Date()为获取当前系统时间

        String bname = request.getParameter("hsbname");
        String hssname = request.getParameter("hssname");
        long hssid = Long.parseLong(request.getParameter("hssid"));
        String hsstatus = request.getParameter("hsstatus");

        Jilu jl = new Jilu(0,bname,hssname,hssid,time,hsstatus);
        System.out.println("  "+bname+" "+hssname+" "+hssid+" "+hsstatus+" ");
        int i = service.insertjieshu(jl);
        System.out.println("是否记录成功："+i);
        if(i!=0){
            System.out.println("记录成功");
            return "success";
        }else {
            System.out.println("记录失败");
            return "fail";
        }
    }
    @GetMapping("/selectjilu")
    public String selectjilu(){
        List list = service.selectjilu();
        Gson gson = new Gson();

        return   gson.toJson(list);
    }
    @GetMapping("/selectonejilu")
    public String selectonejilu(HttpServletRequest request){
        System.out.println("进入记录单查询  ");
        int jlsid = Integer.parseInt(request.getParameter("jlsid"));
        List list = service.selectjilubysid(jlsid);
        Gson gson = new Gson();

        return   gson.toJson(list);
    }

    //学生信息查询
    @GetMapping("/selectxinxi")
    public  String selectxinxi(){
        List list = service.selectxinxi();
        Gson gson = new Gson();
        return gson.toJson(list);
    }




}
