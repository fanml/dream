package com.example.superwoman.controller;

import com.example.superwoman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/login")
    public String login() {
        userService.selectUserByName("admin");
        return "login";
    }

    @RequestMapping(value = "/register")
    public String register(){
        userService.insertUser("fml","123456");
        return "login";
    }
}
