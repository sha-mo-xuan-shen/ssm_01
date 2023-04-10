package com.ssm.service.impl;

import com.ssm.dao.BookDao;
import com.ssm.domain.Book;
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

        return bookDao.getById(id);

    }

    public List<Book> getAll() {
        List<Book> all = bookDao.getAll();
        return all;
    }
}
