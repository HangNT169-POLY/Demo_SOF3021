package com.hangnt.demo_sof3021.Buoi1_OverviewSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
    @GetMapping(value = "/test")
    public String welcome(Model model) {
        model.addAttribute("message", "HangNT169");
        return "buoi1/home";
    }
}
