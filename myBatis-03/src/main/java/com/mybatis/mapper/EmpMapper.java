package com.mybatis.mapper;

import com.mybatis.pojo.Emp;

import java.util.List;

public interface EmpMapper {
List<Emp> getAllEmp();
Emp getEmpAndDept(int eid);
Emp getEmpAndDeptStepOne(int i);
List<Emp> getEmpAndDeptStepTwo(int did);
}
