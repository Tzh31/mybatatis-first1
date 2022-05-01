package com.mybatis.pojo;

import java.util.List;

public class cClass {
    private String id;
    private String className;
  private List<sStudent>students;

    @Override
    public String toString() {
        return "cClass{" +
                "id='" + id + '\'' +
                ", className='" + className + '\'' +
                ", students=" + students +
                '}';
    }

    public List<sStudent> getStudents() {
        return students;
    }

    public void setStudents(List<sStudent> students) {
        this.students = students;
    }

    public String getId() {
        return id;
    }



    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
