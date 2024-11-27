package com.springsec.User_registry_spring_security.service;

import com.springsec.User_registry_spring_security.dto.UserRegistryDto;
import com.springsec.User_registry_spring_security.model.User;

public interface IUserService {

    public User saveUser(UserRegistryDto userRegistryDto);

}
