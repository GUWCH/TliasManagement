package com.itheima.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageResult<Emp> findByPage(EmpQueryParam queryParam) {

        // Long total = empMapper.getTotal();
        // List<Emp> rows = empMapper.findByPage((page - 1) * pageSize, pageSize);
        // return new PageResult<Emp>(total.intValue(), rows);
        // 使用PageHelper分页
        PageHelper.startPage(queryParam.getPage(), queryParam.getPageSize());
        Page<Emp> p = (Page<Emp>) empMapper.findAll(queryParam);
        return new PageResult<Emp>(p.getTotal(), p.getResult());
    }
}
