package com.itheima.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

// 员工实体类
@Data
public class Emp {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private Integer gender;
    private String phone;
    private Integer job;
    private Integer salary;
    private String image;
    private LocalDate entryDate;
    private Integer deptId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private String deptName;
}
