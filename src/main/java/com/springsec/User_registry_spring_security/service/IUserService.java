package com.springsec.User_registry_spring_security.service;

import com.springsec.User_registry_spring_security.dto.UserRegistryDto;
import com.springsec.User_registry_spring_security.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

    public User saveUser(UserRegistryDto userRegistryDto);

}
