package com.aibin.example.springcloud.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果集
 *
 * @param <T> 泛型
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 信息
     */
    private String message;
    /**
     * 返回结果集
     */
    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

}
