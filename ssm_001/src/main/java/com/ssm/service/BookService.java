package com.ssm.service;

import com.ssm.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookService {
    public boolean save(Book book);
    public boolean delete(int id);
    public boolean update(Book book);
    public Book getById(int id);
    public List<Book> getAll();
}
