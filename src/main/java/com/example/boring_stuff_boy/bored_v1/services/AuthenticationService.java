package com.example.boring_stuff_boy.bored_v1.services;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import com.example.boring_stuff_boy.bored_v1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;

    public AuthenticationService(UserService userService, PasswordEncoder passwordEncoder) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
    }
    /*
     * Register a new User
     */
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return this.userService.createNewUser(user);
    }

}
