package com.example.vue.until;

import com.example.vue.ex.ServiceException;
import com.example.vue.ex.UserNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author weiZiHao
 * @date 2021/1/27
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({ServiceException.class})
    public JsonResult<Void> handleException(ServiceException ex) {
        JsonResult<Void> jsonResult = new JsonResult<>(ex);
        if (ex instanceof UserNotFoundException) {
            jsonResult.setCode(2002);
        }
        return jsonResult;
    }
}
