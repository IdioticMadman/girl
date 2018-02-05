package com.robert.util;

import com.robert.domain.Result;

public class ResultUtil<T> {

    public static <T> Result<T> ok(T t) {
        return new Result<>(0, "success", t);
    }

    public static <T> Result<T> ok(String msg, T t) {
        return new Result<>(0, msg, t);
    }

    public static <T> Result<T> ok(int code, String msg, T t) {
        return new Result<>(code, msg, t);
    }

    public static <T> Result<T> error(T t) {
        return new Result<>(1, "error", t);
    }

    public static <T> Result<T> error(String msg, T t) {
        return new Result<>(1, msg, t);
    }

    public static <T> Result<T> error(int code, String msg, T t) {
        return new Result<>(code, msg, t);
    }
}
