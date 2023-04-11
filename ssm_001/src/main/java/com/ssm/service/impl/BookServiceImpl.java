package com.ssm.service.impl;

import com.ssm.controller.Code;
import com.ssm.controller.Result;
import com.ssm.dao.BookDao;
import com.ssm.domain.Book;
import com.ssm.exception.BussinessException;
import com.ssm.exception.SystemException;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean delete(int id) {
        bookDao.delete(id);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public Book getById(int id) {

        if(id==1){
            throw new BussinessException(Code.BUSSINESS_ERR,"找不到1");
        }
        try {
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_TIMEOUT,"查询失败，访问超时");
        }
        return bookDao.getById(id);

    }

    public List<Book> getAll() {

        try {
            int i = 1/0;
        }catch (ArithmeticException e){
            throw new SystemException(Code.SYSTEM_ERR,"查询失败，请重试",e);
        }
        List<Book> all = bookDao.getAll();
        return all;
    }
}
