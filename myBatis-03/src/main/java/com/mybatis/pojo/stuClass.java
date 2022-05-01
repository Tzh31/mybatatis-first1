package com.mybatis.pojo;

public class stuClass {
    int id;
    int classId;
    int sId;

    @Override
    public String toString() {
        return "stuClass{" +
                "id=" + id +
                ", classId=" + classId +
                ", sId=" + sId +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }
}
