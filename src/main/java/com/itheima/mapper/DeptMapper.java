package com.itheima.mapper;

import com.itheima.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;

import java.util.List;

@Mapper
public interface DeptMapper {
    // 查询所有部门数据
    // 解决命名不一直导致数据不对应的问题，使用results和result注解
    // @Results({
    // @Result(property = "id", column = "id"),
    // @Result(property = "name", column = "name"),
    // @Result(property = "createTime", column = "create_time"),
    // @Result(property = "updateTime", column = "update_time")
    // })
    List<Dept> findAll();

    void deleteById(Integer id);
}
