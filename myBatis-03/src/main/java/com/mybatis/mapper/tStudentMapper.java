package com.mybatis.mapper;

import com.mybatis.pojo.tStudent;

import java.util.List;

public interface tStudentMapper {
   public List<tStudent> queryAll();
   public List<tStudent> queryById(String id);
}
