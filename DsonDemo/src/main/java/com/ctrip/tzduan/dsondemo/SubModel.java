package com.ctrip.tzduan.dsondemo;

import java.util.List;

/**
 * Created by tzduan on 17/1/5.
 */

public class SubModel {
    private String tel;
    private String id;
    private String test;
    private List<People> peoples;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public List<People> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<People> peoples) {
        this.peoples = peoples;
    }
}
