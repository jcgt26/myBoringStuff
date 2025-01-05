package com.example.boring_stuff_boy.bored_v1.repositories;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
