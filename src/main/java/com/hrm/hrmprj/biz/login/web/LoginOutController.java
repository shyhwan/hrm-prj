package com.hrm.hrmprj.biz.login.web;

import com.hrm.hrmprj.common.dto.LoginDTO;
import com.hrm.hrmprj.common.dto.UserDTO;
import com.hrm.hrmprj.common.key.SessionAttributeKey;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class LoginOutController {

    @GetMapping("/userLoginForm")
    public ModelAndView userLoginForm(Model model) {
        ModelAndView mav = new ModelAndView("comLayout");
        mav.addObject("viewName", "fragments/main/loginForm");
        return mav;
    }

    @PostMapping("/userLoginSubmit")
    public ModelAndView userLoginSubmit(@RequestBody LoginDTO loginDTO, HttpSession session) {

        if( StringUtils.hasText(loginDTO.getUserId()) ) {
            UserDTO userDTO = new UserDTO();

            session.setAttribute(SessionAttributeKey.USER_DTO.getSESS_KEY(), userDTO);
            session.setAttribute(SessionAttributeKey.LOGIN_DTO.getSESS_KEY(), loginDTO);

            log.debug("!! Welcome back {} !!", loginDTO.getUserId());
            return new ModelAndView("redirect:/");
        }

        ModelAndView mav = new ModelAndView("comLayout");
        mav.addObject("viewName", "fragments/main/loginForm");
        log.debug("!! Login Failed Plese retry !!");
        return mav;
    }

    @GetMapping("/userLogout")
    public ModelAndView logout(HttpSession session) {
        session.invalidate(); // 세션 초기화 (로그아웃)
        log.info("로그아웃 완료");
        return new ModelAndView("redirect:/login"); // 로그인 페이지로 이동
    }
}
