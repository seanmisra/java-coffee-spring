package com.example.javacoffeespring.models;

public class LoginAttempt {

    private String email;
    private String password;
    private Integer attempt;

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

   public Integer getAttempt() {
        return this.attempt;
    }
}
