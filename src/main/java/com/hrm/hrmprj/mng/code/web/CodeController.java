package com.hrm.hrmprj.mng.code.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/mng/code")
public class CodeController {

    @GetMapping("/")
    public ModelAndView mainPage(Model model) {
        ModelAndView mav = new ModelAndView("layout");

        mav.addObject("viewName", "fragments/mng/code/codeList");
        return mav;
    }
}
