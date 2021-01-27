package com.example.vue.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author weiZiHao
 * @date 2021/1/27
 */
/*@Configuration*/
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/user/login");
        registration.excludePathPatterns("/resources/templates/login.html", "/resources/templates/static", "/resources/templates/js/*", "/login");
    }
}
