package com.vmarino.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EcommerceMainController {

    @GetMapping("/")
    public String getHome(final Model model){
        return "home";
    }
}
