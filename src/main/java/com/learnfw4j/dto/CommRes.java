package com.learnfw4j.dto;

public class CommRes <T> {
    private int code;
    private String msg;
    private T data;

    public static <T> CommRes success(T t) {
        return new CommRes(0, "success", t);
    }

    public static CommRes success() {
        return new CommRes(0, "success");
    }

    public static CommRes error() {
        return new CommRes(-1, "error..");
    }

    public CommRes(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public CommRes(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public CommRes() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
