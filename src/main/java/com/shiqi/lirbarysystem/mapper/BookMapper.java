package com.shiqi.lirbarysystem.mapper;

import com.shiqi.lirbarysystem.entity.Book;
import com.shiqi.lirbarysystem.entity.fbook;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BookMapper {
    //根据fid分类查询
    List<Book> selectByfid(int id);
    //根据id查询
    List<Book> selectByid(int id);
    //根据书名查询
    List<Book> selectByname(String bname);
    //查询所有
    List<Book> selectall();
    //根据Id删除
    int deleteById(int id);
    //根据Id修改
    int updateById(Book book);
    //添加数据
    int insert(Book book);
    //分类查询
    List<fbook> selectfbook();
    //修改图书状态
    int updatebookstatus(int id);
}
