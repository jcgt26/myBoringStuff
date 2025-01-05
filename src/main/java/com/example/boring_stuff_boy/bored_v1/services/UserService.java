package com.example.boring_stuff_boy.bored_v1.services;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import com.example.boring_stuff_boy.bored_v1.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createNewUser(User user){
       return  userRepository.save(user);
    }

}
