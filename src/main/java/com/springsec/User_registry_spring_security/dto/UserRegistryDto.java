package com.springsec.User_registry_spring_security.dto;

import com.springsec.User_registry_spring_security.model.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserRegistryDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Collection<Role> roles;


}
