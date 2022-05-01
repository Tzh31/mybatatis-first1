package com.mybatis.mapper;

import com.mybatis.pojo.sStudent;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import javax.management.Query;
import java.util.List;

public interface sStudentMapper {
@Select("select * from s_student where cid=#{id}")
    @Results(id = "stuMap",value = {
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "age",property = "age"),
            @Result(column = "cid",property = "cid")
    })
    List<sStudent>queryById(String id);

@Update("update s_student t set t.name='李雷',t.age='21' where t.id=#{id}")
    int updateById(String id);
}
