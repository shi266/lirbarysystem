package com.shiqi.lirbarysystem.entity;


public class Jilu {
    private long id;
    private String jlbname;
    private String jlsname;
    private long jlid;
    private String time;
    private String status;

    public Jilu(long id, String jlbname, String jlsname, long jlid, String time, String status) {
        this.id = id;
        this.jlbname = jlbname;
        this.jlsname = jlsname;
        this.jlid = jlid;
        this.time = time;
        this.status = status;
    }

    public Jilu() {
        super();
    }

    @Override
    public String toString() {
        return "Jilu{" +
                "id=" + id +
                ", jlbname='" + jlbname + '\'' +
                ", jlsname='" + jlsname + '\'' +
                ", jlid=" + jlid +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJlbname() {
        return jlbname;
    }

    public void setJlbname(String jlbname) {
        this.jlbname = jlbname;
    }

    public String getJlsname() {
        return jlsname;
    }

    public void setJlsname(String jlsname) {
        this.jlsname = jlsname;
    }

    public long getJlid() {
        return jlid;
    }

    public void setJlid(long jlid) {
        this.jlid = jlid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
