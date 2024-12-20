package com.springsec.User_registry_spring_security.service;

import com.springsec.User_registry_spring_security.dto.UserRegistryDto;
import com.springsec.User_registry_spring_security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    User saveUser(UserRegistryDto userRegistryDto);
    List<User> showAllUsers();
}
