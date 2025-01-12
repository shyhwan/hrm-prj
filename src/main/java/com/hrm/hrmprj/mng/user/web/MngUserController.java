package com.hrm.hrmprj.mng.user.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/mng/user")
public class MngUserController {

    @GetMapping("/")
    public ModelAndView mainPage(Model model) {
        ModelAndView mav = new ModelAndView("layout");

        mav.addObject("viewName", "fragments/mng/user/userList");
        return mav;
    }
}
