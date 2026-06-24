package com.itheima.pojo;

import lombok.Data;

@Data
public class Result {
    private Integer code;
    private String msg;
    private Object data;

    public static Result success() {
        Result res = new Result();
        res.setCode(200);
        res.setMsg("success");
        return res;
    }

    public static Result success(Object object) {
        Result res = new Result();
        res.setCode(200);
        res.setMsg("success");
        res.setData(object);
        return res;
    }

    public static Result error(String msg) {
        Result res = new Result();
        res.setCode(-1);
        res.setMsg(msg);
        return res;
    }
}
