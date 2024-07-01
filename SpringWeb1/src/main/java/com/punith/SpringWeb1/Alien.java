package com.punith.SpringWeb1;

public class Alien {
    private int aid;
    private String aname;
    private String acourse;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcourse() {
        return acourse;
    }

    public void setAcourse(String acourse) {
        this.acourse = acourse;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
