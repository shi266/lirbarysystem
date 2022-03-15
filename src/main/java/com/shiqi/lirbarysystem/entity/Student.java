package com.shiqi.lirbarysystem.entity;

import java.math.BigInteger;

public class Student {
    private BigInteger id;
    private String studentname;
    private String studentclass;
    private String phone;
    private String demitory;
    private String tname;

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentname='" + studentname + '\'' +
                ", studentclass='" + studentclass + '\'' +
                ", phone='" + phone + '\'' +
                ", demitory='" + demitory + '\'' +
                ", tname='" + tname + '\'' +
                '}';
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDemitory() {
        return demitory;
    }

    public void setDemitory(String demitory) {
        this.demitory = demitory;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Student(BigInteger id, String studentname, String studentclass, String phone, String demitory, String tname) {
        this.id = id;
        this.studentname = studentname;
        this.studentclass = studentclass;
        this.phone = phone;
        this.demitory = demitory;
        this.tname = tname;
    }
}
