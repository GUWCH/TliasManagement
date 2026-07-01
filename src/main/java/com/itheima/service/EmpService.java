package com.itheima.service;

import java.time.LocalDate;
import java.util.List;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;

public interface EmpService {
    public PageResult<Emp> findByPage(EmpQueryParam queryParam);
}
