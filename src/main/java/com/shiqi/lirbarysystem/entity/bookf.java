package com.shiqi.lirbarysystem.entity;

public class bookf {
    private int id;
    private String bname;
    private String author;
    private String img;
    private int fid;
    private String date;
    private int status;
    private String fname;

    @Override
    public String toString() {
        return "bookf{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", img='" + img + '\'' +
                ", fid=" + fid +
                ", date='" + date + '\'' +
                ", status=" + status +
                ", fname='" + fname + '\'' +
                '}';
    }

    public bookf() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public bookf(int id, String bname, String author, String img, int fid, String date, int status, String fname) {
        this.id = id;
        this.bname = bname;
        this.author = author;
        this.img = img;
        this.fid = fid;
        this.date = date;
        this.status = status;
        this.fname = fname;
    }
}
