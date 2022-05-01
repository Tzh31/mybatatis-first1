package com.mybatis.pojo.mapper;

import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int insertUser(User user);
    void updateUser();
    void deleteUser();
    User getUserById();
    List<User> getAlUser();
    User getUserByName(String name);
    User login(String username,String password);
    User login1(Map<String,Object> map);
User checkLoginByParam(@Param("name") String name , @Param("pwd") String pwd);
}
