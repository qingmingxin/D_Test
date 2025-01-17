package com.qingmingxin.utils;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private int code;
    private String msg;
    private T data;

    public static <E> Result<E> success(E data) {
        return new Result<>(0,"操作成功",data);
    }

    public static <E> Result<E> success(){
        return new Result<>(0,"操作成功", null);
    }

    public static <E> Result<E> error(String msg) {
        return new Result<>(1, msg, null);
    }

}
