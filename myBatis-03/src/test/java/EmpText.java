import com.mybatis.mapper.*;
//import com.mybatis.mapper.;
//import com.mybatis.mapper.UserMapper;
import com.mybatis.pojo.*;
import com.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

public class EmpText {
    @Test
    public void text(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();

        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);

//        UserMapper mapper1 = sqlSession.getMapper(UserMapper.class);
//        System.out.println(mapper1.getAlUser());
//        for (Emp emp : mapper.getAllEmp()) {
//            System.out.println(emp);
//        }
//        for (Emp emp : mapper.getAllEmp()) {
//            System.out.println(emp);
//        }



        Emp empAndDept = mapper.getEmpAndDept(3);
        System.out.println(empAndDept);

//
//        Emp empAndDeptStepOne = mapper.getEmpAndDeptStepOne(3);
//        System.out.println(empAndDeptStepOne);
    }
    @Test
    public void text1(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept deptAndEmp = mapper.getDeptAndEmp(2);
        System.out.println(deptAndEmp);
//        通过分步查询
//        Dept deptAndEmpByStepOne = mapper.getDeptAndEmpByStepOne(2);
//        System.out.println(deptAndEmpByStepOne);



    }@Test
    public void text01() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> tt = mapper.getEmpByCondition(new Emp(null, "", 22));
        System.out.println(tt);
    }
    @Test
    public void text02() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
//        List<Emp> tt = mapper.getEmpByChoose(new Emp(null, "", 22));
//        System.out.println(tt);
        //批量删除
//        int i = mapper.deleteMoreByArray(new Integer[]{9, 10,11});
//        System.out.println(i);
    //批量插入
//        Emp emp=new Emp(null,"陶子涵一号",22);
//        Emp emp1=new Emp(null,"陶子涵二号",22);
//
//        Emp emp2=new Emp(null,"陶子涵三号",22);
//List<Emp> list= Arrays.asList(emp,emp2,emp1);
//        int i = mapper.insertMoreByList(list);
//
//        System.out.println(i);

        //查询所有
//        for (Emp emp : mapper.selectAll()) {
//            System.out.println(emp);
//        }


        //更改
//        Emp emp=new Emp();
//        emp.setEid(17);
//        emp.setEmpName("桃子哈to");
//        emp.setAge(555);
//        int i = mapper.upDateEmp(emp);
//        if (i>0){
//            System.out.println("更改成功");
//        }

        //查询数量
        int total = mapper.findTotal();
        System.out.println(total);


        //根据id来查
//        Emp byId = mapper.findById(1);
//        System.out.println(byId);
//寻找
//        List<Emp> emps = mapper.findByName("子涵");
//        System.out.println(emps);


    }
    @Test
    public void Test4(){

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        tStudentMapper mapper = sqlSession.getMapper(tStudentMapper.class);
//        for (tStudent tStudent : mapper.queryAll()) {
//            System.out.println(tStudent);
//        }
        List<tStudent> tStudents = mapper.queryById(String.valueOf(1));
        System.out.println(tStudents);


    }
    @Test
    public void Test5(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        tClassMapper mapper = sqlSession.getMapper(tClassMapper.class);
        for (tClass tClass : mapper.queryAll()) {
            System.out.println(tClass);
        }
//        for (tClass tClass : mapper.queryById("101")) {
//            System.out.println(tClass);
//        }


    }
    @Test
    public void test56(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        cClassMapper mapper = sqlSession.getMapper(cClassMapper.class);
        for (cClass cClass : mapper.queryAll("2")) {
            System.out.println(cClass);
        }

//        List<Emp> tt = mapper.getEmpByCondition(new Emp(null, "", 22));
//        System.out.println(tt);
    }
    @Test
    public void test7(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        sStudentMapper mapper = sqlSession.getMapper(sStudentMapper.class);
        for (sStudent sStudent : mapper.queryById("2")) {
            System.out.println(sStudent);
        }}
        @Test
        public void test8(){
            SqlSession sqlSession = SqlSessionUtils.getSqlSession();
            sStudentMapper mapper = sqlSession.getMapper(sStudentMapper.class);

            try {
               int i = mapper.updateById("4");
                if (i>0){
                    System.out.println("修改成功");
                }
                else {
                    System.out.println("修改失败");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }


//        List<Emp> tt = mapper.getEmpByCondition(new Emp(null, "", 22));
//        System.out.println(tt);
    }
    }
