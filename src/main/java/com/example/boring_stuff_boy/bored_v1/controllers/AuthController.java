package com.example.boring_stuff_boy.bored_v1.controllers;

import com.example.boring_stuff_boy.bored_v1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final UserService userService;

    @Autowired
    AuthController(UserService userService) {
        this.userService = userService;
    }
}
