package com.springsec.User_registry_spring_security.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class UserRegistryDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;

}
