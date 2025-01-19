package com.example.boring_stuff_boy.bored_v1.controllers;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import com.example.boring_stuff_boy.bored_v1.exceptions.UserCreationException;
import com.example.boring_stuff_boy.bored_v1.services.AuthenticationService;
import com.example.boring_stuff_boy.bored_v1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthenticationService authenticationService;
  //  private final UserService userService;

    @Autowired
    AuthController(AuthenticationService authenticationService, UserService userService) {
        this.authenticationService = authenticationService;
        //this.userService = userService;
    }

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @PostMapping("/register")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        if (user.getEmail() == null || user.getPassword() == null) {
            return ResponseEntity.badRequest().build();
        }
        try {
            return ResponseEntity.ok().body(this.authenticationService.registerUser(user));
        } catch (UserCreationException exception) {
            return ResponseEntity.badRequest().build();
        }catch (Exception anyOtherException) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
