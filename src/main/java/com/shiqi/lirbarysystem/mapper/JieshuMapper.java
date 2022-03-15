package com.shiqi.lirbarysystem.mapper;

import com.shiqi.lirbarysystem.entity.Jilu;
import com.shiqi.lirbarysystem.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface JieshuMapper {
    //添加借书记录
    int insertjieshu(Jilu jilu);
    //添加还书记录
    int inserthuanshu(Jilu jilu);
    //查询借阅记录
    List selectjilu();
    //按学号查询借阅记录
    List selectjilubysid(int jlid);
    //学生信息查询
    List selectxinxi();

}
