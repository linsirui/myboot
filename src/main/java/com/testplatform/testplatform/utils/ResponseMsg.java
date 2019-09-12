package com.testplatform.testplatform.utils;

public class ResponseMsg<T> {

    private boolean result;
    private int code = 0;
    private String description ="";
    private T data = null;

    public ResponseMsg(boolean result,int code,String description){

        this.result = result;
        this.code = code;
        this.description = description;
        this.data = null;
    }

    public ResponseMsg(boolean result,int code,String description,T data){

        this.result = result;
        this.code = code;
        this.description = description;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
