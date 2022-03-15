package com.shiqi.lirbarysystem.entity;

import java.math.BigInteger;

public class Baosun {
    private BigInteger id;
    private String bsname;
    private String time;
    private String context;
    private String status;

    public Baosun() {
        super();
    }



    @Override
    public String toString() {
        return "Baosun{" +
                "id=" + id +
                ", bsname='" + bsname + '\'' +
                ", time='" + time + '\'' +
                ", context='" + context + '\'' +
                ", status=" + status +
                '}';
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getBsname() {
        return bsname;
    }

    public void setBsname(String bsname) {
        this.bsname = bsname;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Baosun(BigInteger id, String bsname, String time, String context, String status) {
        this.id = id;
        this.bsname = bsname;
        this.time = time;
        this.context = context;
        this.status = status;
    }
}
