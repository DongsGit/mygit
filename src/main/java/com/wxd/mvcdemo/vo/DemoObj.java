package com.wxd.mvcdemo.vo;

/**
 * Created by TEACHER on 2018/1/24.
 */
public class DemoObj {
    private Integer id;
    private String name;

    public DemoObj() {
    }

    public DemoObj(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
