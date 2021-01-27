package com.example.vue.until;

import lombok.Data;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author weiZiHao
 * @date 2021/1/27
 */
@Data
public class JsonResult<T> {

    private Integer code;
    private String msg;
    private T data;

    public JsonResult() {
        super();
    }

    public JsonResult(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public JsonResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(Exception ex) {
        this.msg = ex.getMessage();
    }
}
