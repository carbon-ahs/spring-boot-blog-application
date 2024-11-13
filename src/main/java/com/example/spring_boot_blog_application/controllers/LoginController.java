package com.example.spring_boot_blog_application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {

//    @Autowired
//    private PostService postService;

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String postLoginPage(){
        return "redirect:/";
    }
}
