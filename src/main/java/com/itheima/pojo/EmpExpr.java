package com.itheima.pojo;

import java.time.LocalDate;

import lombok.Data;

/**
 * 员工工作经历
 */
@Data
public class EmpExpr {
    private Integer id;
    private Integer empId;
    private String company;
    private String job;
    private LocalDate begin;
    private LocalDate end;
}
