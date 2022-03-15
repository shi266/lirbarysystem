package com.shiqi.lirbarysystem.textcontroller;

import com.google.gson.Gson;
import com.shiqi.lirbarysystem.entity.Book;
import com.shiqi.lirbarysystem.entity.fbook;
import com.shiqi.lirbarysystem.service.serviceimpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/shiqi")
public class BookController {
    @Autowired
    BookServiceImpl service;
    //分类查询（根据id）
    @GetMapping("/selectFid")
    public String selectFid(HttpServletRequest request, int id){
        System.out.println("进入分类查询");
        int fid = Integer.parseInt(request.getParameter("id"));
        List list = service.selectByfid(fid);
        Gson gson = new Gson();
//        System.out.println("返回的json数据："+gson.toJson(list));
        return gson.toJson(list);

    }
    //按书名查询
    @GetMapping("/selectbyname")
    public String selectname(HttpServletRequest request){
        System.out.println("按书名查询");
       String bname = request.getParameter("bname");
        System.out.println("所查询的书籍名："+bname);
        List list = service.selectByname(bname);
        Gson gson = new Gson();
//        System.out.println("返回的json数据："+gson.toJson(list));
        return gson.toJson(list);

    }
//查询全部
    @GetMapping("/selectall")
    public String selectall(HttpServletRequest request){
        System.out.println("进入全查询");

        List list = service.selectall();
        Gson gson = new Gson();
//        System.out.println("返回的json数据："+gson.toJson(list));
        return gson.toJson(list);

    }
//删除数据
    @GetMapping("/delete")
    public String delete(HttpServletRequest request) {
        System.out.println("进入全查询");
        int id = Integer.parseInt(request.getParameter("id"));
        int i = service.deleteById(id);
        if (i != 0) {
            System.out.println("删除成功");
            return "success";
        } else {
            System.out.println("删除失败");
            return "fail";
        }
    }

    @GetMapping("/toupdate")
    public ModelAndView up(HttpServletRequest request){
        System.out.println("需要修改大的数据");
        int id = Integer.parseInt(request.getParameter("id"));
        ModelAndView mv = new ModelAndView();
        mv.setViewName("Bupdate.html");
        List list = service.selectByid(id);
        System.out.println(list);
        mv.addObject("json",list);
        return mv;

    }
    @GetMapping("/getupdate")
    public String toup(HttpServletRequest request){
        System.out.println("需要修改大的数据");
        int id = Integer.parseInt(request.getParameter("id"));
        List list = service.selectByid(id);
        System.out.println(list);
        Gson gson = new Gson();

        return gson.toJson(list);
    }

    //修改数据
    @GetMapping("/update")
    public String update(HttpServletRequest request){
        System.out.println("正在修改");
        int tid;
        int tfid;
        int tstatus;

        String id = request.getParameter("id");
        if(id.length()>10){
            System.out.println("获取的id不是所需要的");
            tid=0;
        }else {
            tid=Integer.parseInt(id);
        }
        String bname = request.getParameter("boname");
        String author = request.getParameter("author");
        String img = request.getParameter("img");
        String fid = request.getParameter("fid");
        if(fid==""){
            tfid = 0;
        }else {
            tfid=Integer.parseInt(fid);
        }

        String date = request.getParameter("date");
        String status = request.getParameter("status");
        if(status==""){
            tstatus = 0;
        }else {
            tstatus=Integer.parseInt(status);
        }
        System.out.println(id+"--"+bname+"--"+author+"--"+img+"--"+fid+"--"+date+"--"+status);
        Book book = new Book(bname,author,img,tfid,date,tstatus,tid);
        System.out.println(book);
        int i = service.updateById(book);
        System.out.println("i的值："+i);
            if(i!=0){
                System.out.println("修改成功");
                return "success";
            }else {
                System.out.println("修改失败");
                return "fail";
            }




    }
    @GetMapping("/insert")
public String insert(HttpServletRequest request){
        int tfid;
        int tstatus;
        System.out.println("获取添加的数据");
        String bname = request.getParameter("bname");
        String author = request.getParameter("author");
        String img = request.getParameter("img");
        String fid = request.getParameter("fid");
        System.out.println("菜啊次啊："+fid);
        if(fid==""){
             tfid = 1;
        }else {
            tfid=Integer.parseInt(fid);
        }

//        int fid = Integer.parseInt(request.getParameter("fid"));
        String date = request.getParameter("date");
        String status = request.getParameter("status");
        if(status==""){
            tstatus = 0;
        }else {
            tstatus=Integer.parseInt(status);
        }

        Book book = new Book(bname,author,img,tfid,date,tstatus);
        int i = service.insert(book);
        if(i!=0){
            System.out.println("添加成功");
            return "success";
        }else {
            System.out.println("添加失败");
            return "fail";
        }


}

@GetMapping("/fenselect")
    public String selectfbook(){
        List list = service.selectfbook();
        Gson gson = new Gson();

        return gson.toJson(list);
}

    @GetMapping("/te")
    public ModelAndView te(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        System.out.println("进入te  modedl");
        String id = request.getParameter("id");
        System.out.println("获取："+id);
//        mv.addObject("jjj","sss");
        mv.setViewName("login.html");
        mv.addObject("message",id);
        List list = service.selectfbook();
        Gson gson = new Gson();
        mv.addObject("json",list);
        return mv;

    }

}
