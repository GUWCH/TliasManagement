package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;
import com.itheima.pojo.PageResult;
import com.itheima.pojo.Result;
import com.itheima.service.EmpService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {
    @Autowired
    private EmpService empService;

    // @GetMapping
    // public Result findByPage(@RequestParam(defaultValue = "1") Integer page,
    // @RequestParam(defaultValue = "10") Integer pageSize) {
    // PageResult<Emp> pageResult = empService.findByPage(page, pageSize);
    // return Result.success(pageResult);
    // }

    @GetMapping
    public Result findByPage(EmpQueryParam queryParam) {
        log.info("queryParam: {}", queryParam);
        PageResult<Emp> pageResult = empService.findByPage(queryParam);
        return Result.success(pageResult);
    }
}
