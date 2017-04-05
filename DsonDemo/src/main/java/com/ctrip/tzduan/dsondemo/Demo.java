package com.ctrip.tzduan.dsondemo;

import java.util.List;

/**
 * Created by tzduan on 17/1/5.
 */

public class Demo {
    private String demo;
    private String classa;
    private String time;
    private double mun;
    private List<Friend> friends;

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getClassa() {
        return classa;
    }

    public void setClassa(String classa) {
        this.classa = classa;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getMun() {
        return mun;
    }

    public void setMun(double mun) {
        this.mun = mun;
    }
}
