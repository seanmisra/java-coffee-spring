package com.example.javacoffeespring.controllers;

import com.example.javacoffeespring.models.LoginAttempt;
import com.example.javacoffeespring.models.UserAccount;
import com.example.javacoffeespring.models.UserResponse;
import com.example.javacoffeespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/validateUser")
    public boolean validateUser(@RequestBody LoginAttempt loginAttempt) {
        return this.userService.validateUser(loginAttempt);
    }

    @PostMapping("/createAccount")
    public UserResponse createAccount(@RequestBody UserAccount userAccount) {
        return this.userService.addUserAccount(userAccount);
    }

}
