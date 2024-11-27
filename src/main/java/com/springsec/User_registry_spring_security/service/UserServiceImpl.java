package com.springsec.User_registry_spring_security.service;

import com.springsec.User_registry_spring_security.dto.UserRegistryDto;
import com.springsec.User_registry_spring_security.model.Role;
import com.springsec.User_registry_spring_security.model.User;
import com.springsec.User_registry_spring_security.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User saveUser(UserRegistryDto userRegistryDto) {
        User user = new User(
                userRegistryDto.getName(),
                userRegistryDto.getLastName(),
                userRegistryDto.getEmail(),
                userRegistryDto.getPassword(),
                Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }
}
