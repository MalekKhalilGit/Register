package com.example.registrationlogin.service;

import com.example.registrationlogin.model.User;
import com.example.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User save(UserRegistrationDto registrationDto);
}
