package com.shiqi.lirbarysystem.service.serviceimpl;

import com.shiqi.lirbarysystem.entity.Jilu;
import com.shiqi.lirbarysystem.entity.Student;
import com.shiqi.lirbarysystem.mapper.JieshuMapper;
import com.shiqi.lirbarysystem.service.JIeshuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JishuServiceImpl implements JIeshuService {
    @Autowired
    JieshuMapper mapper;
    @Override
    public int insertjieshu(Jilu jilu) {
        int i = mapper.insertjieshu(jilu);
        return i;
    }

    @Override
    public int inserthuanshu(Jilu jilu) {
        int i = mapper.inserthuanshu(jilu);
        return i;
    }

    @Override
    public List selectjilu() {
        List list = mapper.selectjilu();
        return list;
    }

    @Override
    public List selectjilubysid(int jlid) {
        List list = mapper.selectjilubysid(jlid);
        return list;
    }

    @Override
    public List selectxinxi() {
        List list = mapper.selectxinxi();
        return list;
    }
}
