package com.mybatis.pojo.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {
    User getUserById(@Param("id") Integer id);
int deleteMore(@Param("ids") String ids);
List<User> getUserByTableName(@Param("tableName") String tableName);
void insertUser(User user);
}
