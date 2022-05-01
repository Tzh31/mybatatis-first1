package com.mybatis.mapper;

import com.mybatis.pojo.tClass;

import java.util.List;

public interface tClassMapper {
    public List<tClass> queryAll();
    public List<tClass> queryById(String id);

}
