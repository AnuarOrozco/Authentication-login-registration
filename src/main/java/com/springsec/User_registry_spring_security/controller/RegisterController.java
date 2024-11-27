package com.springsec.User_registry_spring_security.controller;

import com.springsec.User_registry_spring_security.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterController {

    private final IUserService userService;

    public RegisterController(@Lazy IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @GetMapping("/")
    public String showLandingPage(Model model) {
        // Cargar todos los usuarios y agregar al modelo
        model.addAttribute("users", userService.showAllUsers());
        return "index";
    }
}



