package com.tupseny.kateweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home_def(){
        return "/home";
    }

    @GetMapping("/home")
    public String home(){
        return "/home";
    }

    @GetMapping("/admin")
    public String admin(){
        return "/admin";
    }

    @GetMapping("/user")
    public String user(){
        return "/user";
    }

    @GetMapping("/about")
    public String about() {
        return "/about";
    }

    @GetMapping("/login")
    public String login() {
        return "/login";
    }

    @GetMapping("/access-denied")
    public String error403() {
        return "/errors/403";
    }

    @GetMapping("/me")
    public String profile(){
        return "/profile";
    }

    @GetMapping("/register")
    public String register(){
        return "/register";
    }

    @GetMapping("/logout")
    public String logout(){
        return "/home";
    }

}
