package com.ssm.dao;

import com.ssm.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {

    // @Insert("insert into book values (null,#{type},#{name},#{description})")
    @Insert("insert into book (type,name,description)values(#{type},#{name},#{description})")
    public void save(Book book);
    @Delete("delete from book where id=#{id}")
    public void delete(int id);
    @Update("update book set type=#{type},name=#{name},description=#{descrption} where id = #{id}")
    public void update(Book book);
    @Select("select * from book where id=#{id}")
    public Book getById(int id);
    @Select("select * from book")
    public List<Book> getAll();
}
