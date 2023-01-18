package com.example.javacoffeespring.service;

import com.example.javacoffeespring.models.LoginAttempt;
import com.example.javacoffeespring.models.UserAccount;
import com.example.javacoffeespring.models.UserResponse;
import com.example.javacoffeespring.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserResponse addUserAccount (UserAccount userAccount) {
        UserAccount existingAccount = this.getUserAccountWrapper(userAccount.getEmail());
        UserResponse userResponse = new UserResponse();
        if (existingAccount != null) {
            userResponse.setMessage("ERROR: Account already exists");
        } else {
            this.userRepository.save(userAccount);
            userResponse.setMessage("SUCCESS: Account successfully added");
        }

        return userResponse;
    }
    public boolean validateUser(LoginAttempt loginAttempt) {
        UserAccount existingAccount = this.getUserAccountWrapper(loginAttempt.getEmail());

        if (existingAccount == null) {
            return false;
        } else {
            return loginAttempt.getPassword().equals(existingAccount.getPassword());
        }
    }

    public UserAccount getUserAccountWrapper(String email) {
        List<UserAccount> userAccountList = this.userRepository.getUserAccount(email);

        if (userAccountList.isEmpty()) {
            return null;
        } else {
            return userAccountList.get(0);
        }
    }




}
