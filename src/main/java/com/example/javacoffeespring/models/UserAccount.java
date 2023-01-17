package com.example.javacoffeespring.models;

public class UserAccount {
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private Long loyaltyPoints = 10L; // new user starts with 10 points

    public UserAccount(String firstName, String lastName, String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public Long getLoyaltyPoints() {
        return this.loyaltyPoints;
    }

}
