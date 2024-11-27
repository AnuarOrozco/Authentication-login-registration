package com.springsec.User_registry_spring_security.controller;

import com.springsec.User_registry_spring_security.dto.UserRegistryDto;
import com.springsec.User_registry_spring_security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class UserRegistryController {

    @Autowired
    private UserServiceImpl userService;

    @ModelAttribute("user")
    public UserRegistryDto returnNewUserRegistryDto() {
        return new UserRegistryDto();
    }

    @GetMapping
    public String showRegistryForm() {
        return "registryForm.html";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistryDto userRegistryDto) {
        userService.saveUser(userRegistryDto);
        return "redirect:/register?success";
    }

}
