package com.shiqi.lirbarysystem.entity;

public class fbook {
    private int fid;
    private  String fname;

    @Override
    public String toString() {
        return "fbook{" +
                "fid=" + fid +
                ", fname='" + fname + '\'' +
                '}';
    }

    public fbook() {
        super();
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public fbook(int fid, String fname) {
        this.fid = fid;
        this.fname = fname;
    }
}
