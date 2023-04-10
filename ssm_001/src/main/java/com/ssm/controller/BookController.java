package com.ssm.controller;

import com.ssm.domain.Book;
import com.ssm.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    public BookService bookService;

    @PostMapping("/save")
    public boolean save(@RequestBody Book book) {
        bookService.save(book);
        return true;
    }
    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable int id) {
        bookService.delete(id);
        return true;
    }
    @PutMapping("/update")
    public boolean update(@RequestBody Book book) {
        bookService.update(book);
        return true;
    }
    @GetMapping("/{id}")
    public Book getById(@PathVariable int id) {
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }
}
