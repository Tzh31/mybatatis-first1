package com.mybatis.pojo;

import java.util.List;

public class tStudent {
    int id;
    int stdNo;
    String stdName;
List<tClass>classes;

    public int getStdNo() {
        return stdNo;
    }

    public void setStdNo(int stdNo) {
        this.stdNo = stdNo;
    }

    @Override
    public String toString() {
        return "tStudent{" +
                "id=" + id +
                ", classId=" + stdNo +
                ", stdName='" + stdName + '\'' +
                ", classes=" + classes +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getClassId() {
//        return classId;
//    }
//
//    public void setClassId(int classId) {
//        this.classId = classId;
//    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public List<tClass> getClasses() {
        return classes;
    }

    public void setClasses(List<tClass> classes) {
        this.classes = classes;
    }
}
