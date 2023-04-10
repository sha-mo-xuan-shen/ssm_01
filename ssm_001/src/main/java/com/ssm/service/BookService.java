package com.ssm.service;

import com.ssm.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BookService {
    public boolean save(Book book);
    public boolean delete(int id);
    public boolean update(Book book);
    public Book getById(int id);
    public List<Book> getAll();
}
