package com.example.pp315_js.controller;

import com.example.pp315_js.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/admin")
    public String showAllUser(Model model) {
        model.addAttribute("newUser", new User());
        return "admin-panel";
    }

    @GetMapping("/user")
    public String showOneUser() {
        return "user-panel";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
}
