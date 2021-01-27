package com.example.vue.ex;

import lombok.Data;

/**
 * @author weiZiHao
 * @date 2021/1/27
 */
@Data
public class UserNotFoundException extends ServiceException {

    private String message;

    public UserNotFoundException(String msg) {
        super();
        this.message = msg;
    }
}
