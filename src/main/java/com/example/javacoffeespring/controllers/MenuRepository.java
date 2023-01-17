package com.example.javacoffeespring.controllers;

import com.example.javacoffeespring.models.MenuItem;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends CrudRepository<MenuItem, Integer> {
}
