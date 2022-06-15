package com.learn.dao;

import com.learn.bean.Learn;
import org.apache.ibatis.annotations.*;

@Mapper
public interface LearnMapper {


    @Insert("insert into learn(text) values(#{text})")
    void add(@Param("text") String text);


    @Delete("delete from learn where id = #{id}")
    void delete(@Param("id") Integer id);


    @Update("update learn set text = #{text} where id = #{id}")
    void update(@Param("text") String text, @Param("id") Integer id);


    @Select("select * from learn where id = #{id}")
    Learn select(@Param("id") Integer id);
}
