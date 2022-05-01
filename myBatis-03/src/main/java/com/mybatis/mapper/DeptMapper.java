package com.mybatis.mapper;

//import com.mybatis.pojo.Dept;
import com.mybatis.pojo.Dept;
//import com.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpStepTwo(Integer did);
    Dept getDeptAndEmp(@Param("did") int did);
    Dept getDeptAndEmpByStepOne(@Param("did") Integer did);
}
