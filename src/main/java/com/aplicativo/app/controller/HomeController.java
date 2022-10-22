package com.aplicativo.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private static final String HOME_INDEX = "welcome";

    @GetMapping("/")
    public String index(Model model){
        return HOME_INDEX;
    }
}
