package com.hrm.hrmprj.system.interceptor;

import com.hrm.hrmprj.common.dto.LoginDTO;
import com.hrm.hrmprj.common.dto.UserDTO;
import com.hrm.hrmprj.common.key.SessionAttributeKey;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerInterceptor;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;

@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws IOException {
        HttpSession sess = req.getSession();
        LoginDTO loginDTO = (LoginDTO) sess.getAttribute(SessionAttributeKey.LOGIN_DTO.getSESS_KEY());

        log.debug("==== LOGIN CHECK ===========================================================");
        if( loginDTO == null || !loginDTO.isLoginYn() ) {
            res.sendRedirect("/userLoginForm");

            log.debug("!! Redirect to /userLoginForm !!");
            return false;
        }

        log.debug("!! IS LOGIN : {} !!", loginDTO.getUserId());
        return true;
    }
}
