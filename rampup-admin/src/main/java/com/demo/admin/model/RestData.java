package com.demo.admin.model;

import lombok.Data;

import java.util.UUID;

@Data
public class RestData<T> {

    private T data;

    private String code;

    private String message;

    private String requestId = UUID.randomUUID().toString();

    public static <T> RestData<T> success() {
        RestData<T> rtn = new RestData<>();
        rtn.setCode("0");
        rtn.setMessage("SUCCESS");
        return rtn;
    }

    public static <T> RestData<T> success(T t) {
        RestData<T> rtn = new RestData<>();
        rtn.setData(t);
        rtn.setCode("0");
        rtn.setMessage("SUCCESS");
        return rtn;
    }

    public static <T> RestData<T> success(T t, String message) {
        RestData<T> rtn = new RestData<>();
        rtn.setData(t);
        rtn.setCode("0");
        rtn.setMessage(message);
        return rtn;
    }

    public static <T> RestData<T> failed() {
        RestData<T> rtn = new RestData<T>();
        rtn.setCode("1");
        rtn.setMessage("FAILED");
        return rtn;
    }

    public static <T> RestData<T> failed(T data) {
        RestData<T> rtn = new RestData<T>();
        rtn.setData(data);
        rtn.setCode("1");
        rtn.setMessage("FAILED");
        return rtn;
    }

    public static <T> RestData<T> failed(T t, String message) {
        RestData<T> rtn = new RestData<T>();
        rtn.setData(t);
        rtn.setCode("1");
        rtn.setMessage(message);
        return rtn;
    }

}
