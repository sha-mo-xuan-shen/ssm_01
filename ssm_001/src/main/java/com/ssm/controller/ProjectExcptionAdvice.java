package com.ssm.controller;

import com.ssm.exception.BussinessException;
import com.ssm.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ProjectExcptionAdvice {
    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){

        return new Result(e.getCode(), (Object) null,e.getMessage());
    }

    @ExceptionHandler(BussinessException.class)
    public Result doBussinessException(BussinessException e){

        return new Result(e.getCode(), (Object) null,e.getMessage());
    }
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(Code.SYSTEM_UNKNOW_ERR, (Object) null,"未知错误");
    }
}
