package com.example.boring_stuff_boy.bored_v1.controllers.validators;

import com.example.boring_stuff_boy.bored_v1.entities.User;
import com.example.boring_stuff_boy.bored_v1.exceptions.UserCreationException;
import com.example.boring_stuff_boy.bored_v1.interfaces.IUser;
import com.example.boring_stuff_boy.bored_v1.utility.Guard;

public class UserValidator {
    public static IUser validateUser(IUser user) throws UserCreationException {
        Guard.throwIf(user == null,  new UserCreationException("No valid instance"));
        Guard.throwIf(user.getEmail() == null,  new UserCreationException("No valid E-Mail"));
        Guard.throwIf(user.getName() == null,  new UserCreationException("No valid Name"));
        Guard.throwIf(user.getRole() == null,  new UserCreationException("No valid Role"));
        Guard.throwIf(user.getUsername() == null,  new UserCreationException("No valid Username"));
        Guard.throwIf(user.getPassword() == null,  new UserCreationException("No valid Password"));

        return user;
    }
}
