package com.apress.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("/demo")
    public String demo(Model model) {
        model.addAttribute("users", userRepo.findAll());
        return "index";
    }
}