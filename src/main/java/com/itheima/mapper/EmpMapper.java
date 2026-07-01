package com.itheima.mapper;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.itheima.pojo.Emp;
import com.itheima.pojo.EmpQueryParam;

@Mapper
public interface EmpMapper {
    // public List<Emp> findAll();

    // 查询总记录数
    @Select("select count(*) from emp e left join dept d on d.id = e.dept_id;")
    public Long getTotal();

    // 分页查询
    public List<Emp> findByPage(EmpQueryParam queryParam);

    public List<Emp> findAll(EmpQueryParam queryParam);
}
