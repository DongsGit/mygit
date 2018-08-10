package com.wxd.mvcdemo.entity;

/**
 * Author:崔译 cuiyi@itany.com
 * Date : 2018-08-10 21:25
 * Description: <描述>
 * Version: V1.0
 */
public class MyView {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public MyView(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public MyView() {
    }
}
