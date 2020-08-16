package com.learnspringcloud.ribbonservice.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;
import lombok.Setter;

/**
 * @author: Yao Frankie
 * @date: 2020/8/15 15:02
 */
@Setter
@Getter
public class CommonResult<T> {
    private T data;

//    public CommonResult(){}

    public CommonResult(T data, String msg, int code){
        this.data = data;
    }

    public CommonResult(String msg, int code){
        this(null, msg, code);
    }

    public CommonResult(T data){
        this(data, "操作成功", 200);
    }
}
