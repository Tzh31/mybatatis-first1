package com.mybatis.mapper;

import com.mybatis.pojo.cClass;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface cClassMapper {
    @Select("select * from c_class where id=#{id}")
    @Results(id = "classMap",value = {
            @Result(column ="id",property = "id"),
            @Result(column = "classname",property = "className"),

    @Result(column ="id",property = "students",javaType = List.class,many = @Many(select = "com.mybatis.mapper.sStudentMapper.queryById"))
    })
    List<cClass> queryAll(String id);
}
