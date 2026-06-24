package com.itheima.pojo;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dept {
    /**
     * 部门实体类
     * id 部门编号
     * name 部门名称
     * createTime创建时间
     * updateTime修改时间
     */
    private Integer id;
    private String name;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
