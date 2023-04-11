package com.ssm.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExcptionAdvice {

    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        System.out.println("说藏话了");
        return new Result(15,null);
    }
}
