package com.example.javacoffeespring.models;

import jakarta.persistence.*;

@Table(name = "user_account")
@Entity
public class UserAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    // TODO: Encrypt this value!
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "loyalty_points")
    private Long loyaltyPoints = 10L; // new user starts with 10 points

    public UserAccount() {
    }
    public UserAccount(String firstName, String lastName, String password, String email) {
        super();
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
