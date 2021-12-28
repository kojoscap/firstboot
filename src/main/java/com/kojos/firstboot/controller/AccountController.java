package com.kojos.firstboot.controller;

import com.kojos.firstboot.model.Users;
import com.kojos.firstboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login(){
        return "account/login";
    }

    @PostMapping("/login")
    public String loginSuccess(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "account/register";
    }
    @PostMapping("/register")
    public String register(Users users){
//        비지니스로직이 들어간다.
        userService.save(users);
        return "redirect:/";
    }
}
