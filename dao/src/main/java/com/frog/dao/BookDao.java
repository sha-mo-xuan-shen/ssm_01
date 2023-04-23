package com.frog.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;
@Repository
public interface BookDao {

    @Select("select * from book;")
    public List<Book> getAll();
    @Select("select * from book where id={id}")
    public Book getById(int id);
    @Insert("insert into book (type,name,descrption)values ({type},{name},{description})")
    public int save(String type,String name,String descrption);
    @Delete("delete from book where id = {id}")
    public int delete(int id);
    @Update("update book set type={type},name={name},description={description} where id={id}")
    public int update(int id,String type,String name,String description);

}
