package com.itheima.controller;

import com.itheima.pojo.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.DeptService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    // 可直接替换为GetMapping
    // @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list() {
        List<Dept> depsList = deptService.findAll();
        System.out.println("list");
        return Result.success(depsList);
    }

    // 删除
    @DeleteMapping("/depts?{id}")
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
    public void delete(Integer id) {
        System.out.println(id);
        deptService.deleteById(id);
    }
}
