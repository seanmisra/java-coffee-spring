package com.example.javacoffeespring.service.repository;

import com.example.javacoffeespring.models.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuRepository extends CrudRepository<MenuItem, Integer> {
}
