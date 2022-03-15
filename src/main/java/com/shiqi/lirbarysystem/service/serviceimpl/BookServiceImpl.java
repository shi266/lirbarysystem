package com.shiqi.lirbarysystem.service.serviceimpl;

import com.shiqi.lirbarysystem.entity.Book;
import com.shiqi.lirbarysystem.entity.fbook;
import com.shiqi.lirbarysystem.mapper.BookMapper;
import com.shiqi.lirbarysystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookMapper mapper;
    @Override
    public List<Book> selectByfid(int id) {
        List list  = mapper.selectByfid(id);
        return list;
    }

    @Override
    public List<Book> selectByid(int id) {
        List list  = mapper.selectByid(id);
        return list;
    }

    @Override
    public List<Book> selectByname(String bname) {
        List list  = mapper.selectByname(bname);
        return list;
    }

    @Override
    public List<Book> selectall() {
        List list  = mapper.selectall();
        return list;
    }

    @Override
    public int deleteById(int id) {
        int i = mapper.deleteById(id);
        return i;
    }

    @Override
    public int updateById(Book book) {
        int i = mapper.updateById(book);
        System.out.println("mapper执行的i:"+i);
        return i;
    }

    @Override
    public int insert(Book book) {
        int i = mapper.insert(book);
        return i;
    }

    @Override
    public List<fbook> selectfbook() {
        List list = mapper.selectfbook();
        return list;
    }
}
