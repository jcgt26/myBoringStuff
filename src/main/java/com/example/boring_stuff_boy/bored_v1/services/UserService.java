package com.example.boring_stuff_boy.bored_v1.services;

import com.example.boring_stuff_boy.bored_v1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private final UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository, UserRepository userRepository1) {
        this.userRepository = userRepository1;
    }
}
