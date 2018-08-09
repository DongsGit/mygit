package com.wxd.mvcdemo.vo;

public class ActionResult {
    private String msg;
    private Integer status;
    private Object data;


    public static ActionResult defaultOk(String msg,Object data) {
        ActionResult result = new ActionResult(msg, 200, data);
        return result;
    }

    public static ActionResult defaultOk() {
        return defaultOk("ok",null);
    }

    public static ActionResult defaultFail(String message) {
        ActionResult result = new ActionResult(message,500 , null);
        return result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ActionResult(String msg, Integer status, Object data) {
        this.msg = msg;
        this.status = status;
        this.data = data;
    }

    public ActionResult() {

    }
}
