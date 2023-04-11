package com.ssm.controller;

import com.ssm.domain.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    Object data;
    Integer code;
    String msg;

    public Result(Integer code, Object data) {
        this.code=code;
        this.data=data;
    }
    public Result(Integer code, Object data,String msg) {
        this.code=code;
        this.data=data;
        this.msg=msg;
    }
}
