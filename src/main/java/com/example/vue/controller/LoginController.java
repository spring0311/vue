package com.example.vue.controller;

import com.example.vue.entity.User;
import com.example.vue.ex.UserNotFoundException;
import com.example.vue.until.BaseController;
import com.example.vue.until.JsonResult;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author weiZiHao
 * @date 2021/1/27
 */
@Controller
@RequiredArgsConstructor
public class LoginController extends BaseController {

    @GetMapping("/")
    public String loginHtml() {
        return "login";
    }

    @RequestMapping("loginIn")
    public JsonResult<User> login(User user, HttpServletRequest request) {
        if ("wei".equals(user.getUserName()) && "wei".equals(user.getPassword())) {
            user = new User();
            user.setId(784745547l);
            user.setName("魏子皓");
            user.setUserName("wei");
            request.getSession().setAttribute("user", user);
        } else {
            throw new UserNotFoundException("错误!");
        }
        return new JsonResult<>(OK, user);
    }

}
