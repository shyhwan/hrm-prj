package com.hrm.hrmprj.biz.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

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
