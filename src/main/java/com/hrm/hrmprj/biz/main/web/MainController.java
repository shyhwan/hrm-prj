package com.hrm.hrmprj.biz.main.web;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@Slf4j
@Controller
public class MainController {

    @GetMapping("/")
    public ModelAndView mainPage(Model model) {
        ModelAndView mav = new ModelAndView("layout");

        mav.addObject("viewName", "fragments/main/main");
        model.addAttribute("username", "테스터");
        model.addAttribute("currentTime", LocalDateTime.now().toString());

        return mav;
    }

    @GetMapping("/test")
    public ModelAndView testPage(Model model) {
        ModelAndView mav = new ModelAndView("layout");

        mav.addObject("viewName", "fragments/main/test");
        return mav;
    }
}
