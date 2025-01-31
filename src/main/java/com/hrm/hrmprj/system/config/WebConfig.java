package com.hrm.hrmprj.system.config;

import com.hrm.hrmprj.system.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**") // 모든 요청에 적용
                .excludePathPatterns("/userLoginForm", "/resources/**"); // 로그인 페이지는 제외
    }
}
