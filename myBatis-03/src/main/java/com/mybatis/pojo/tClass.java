package com.mybatis.pojo;

import java.util.List;

public class tClass {
    int classNo;
    String name;
List<tStudent> students;

    @Override
    public String toString() {
        return "tClass{" +
                "classNo=" + classNo +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<tStudent> getStudents() {
        return students;
    }

    public void setStudents(List<tStudent> students) {
        this.students = students;
    }
}
