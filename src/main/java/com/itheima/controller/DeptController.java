package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

// 使用@RequestMapping注解抽取公共路径，下方单个请求只需要传递参数
// lombok提供的日志注解@Slf4j
@Slf4j
@RequestMapping("/depts")
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    // 可直接替换为GetMapping
    // @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping
    public Result list() {
        List<Dept> depsList = deptService.findAll();
        System.out.println("list");
        return Result.success(depsList);
    }

    // 删除
    @DeleteMapping
    // 方式一 通过 HttpServeletRequest对象获取
    // public Result delete(HttpServeletRequest request) {
    // String idStr = request.getParameter("id");
    // Integer id = Integer.parseInt(idStr);
    // deptService.deleteById(id);
    // return Result.success();
    // }
    // 方式二 使用@requestParam注解，参数则为必填值，没有则报错，可通过添加第二个参数defaultValue来设置默认值
    // public Result delete(@RequestParam("id") Integer deptId) {
    // System.out.println(deptId);
    // return Result.success();
    // }
    // 方式三 保证参数名与形参一致，直接接受
    public Result delete(Integer id) {
        System.out.println(id);
        deptService.deleteById(id);
        return Result.success();
    }

    // 新增
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        System.out.println("部门信息:" + dept);
        deptService.add(dept);
        return Result.success();
    }

    // 根据id查询
    // @PathVariable注解用于获取路径参数
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id) {
        Dept dept = deptService.getById(id);
        return Result.success(dept);
    }

    // 修改
    @PutMapping
    public Result putMethodName(@RequestBody Dept dept) {
        System.out.println("部门信息:" + dept);
        deptService.update(dept);
        return Result.success();
    }

}
