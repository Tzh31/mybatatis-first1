package com.mybatis.pojo;

public class Emp {
    private Integer eid;

    public Emp(Integer eid, String string, int i) {
        this.eid=eid;
        this.empName=string;
        this.age=i;
    }

    public Emp(Integer eid, String dd, Integer integer) {
        this.empName=dd;
    }



    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    private String empName;
    private Integer age;
    private Integer did;
private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
//        this.dept = dept;
        this.dept=dept;
    }

    public Emp(Integer eid, String empName, Integer age, Integer did) {
        this.eid = eid;
        this.empName = empName;
        this.age = age;
        this.did = did;
    }

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", empName='" + empName + '\'' +
                ", age=" + age +
                ", did=" + did +
                ", dept=" + dept +
                '}';
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }
}
