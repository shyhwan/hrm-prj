package com.hrm.hrmprj.biz.main.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("username", "테스터");
        model.addAttribute("currentTime", LocalDateTime.now().toString());

        return "/main/main";
    }
}
