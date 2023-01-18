package com.example.javacoffeespring.service.repository;

import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.models.UserAccount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<UserAccount, Integer> {

    @Query("SELECT user FROM UserAccount user WHERE LOWER(user.email) = LOWER(:emailAddress)")
    public List<UserAccount> getUserAccount(@Param("emailAddress") String emailAddress);
}
