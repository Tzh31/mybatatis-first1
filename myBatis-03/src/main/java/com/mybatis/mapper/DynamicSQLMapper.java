package com.mybatis.mapper;

import com.mybatis.pojo.Emp;
import com.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    List <Emp> getEmpByCondition(Emp emp);
    List<Emp> getEmpByChoose(Emp emp);
    int deleteMoreByArray(@Param("eids") Integer[] eids);
    int insertMoreByList(@Param("emps") List<Emp>emps);
//    List
    List<Emp> selectAll();
    int upDateEmp(Emp emp);
    int findTotal();
Emp findById(Integer eid);
List<Emp> findByName(String empName);
}
