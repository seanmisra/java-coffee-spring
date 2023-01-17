package com.example.javacoffeespring.repository;

import com.example.javacoffeespring.models.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<MenuItem, Integer> {
}