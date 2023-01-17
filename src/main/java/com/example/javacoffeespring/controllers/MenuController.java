package com.example.javacoffeespring.controllers;

import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.models.MenuItemType;
import com.example.javacoffeespring.models.UserAccount;
import com.example.javacoffeespring.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
public class MenuController {
    @Autowired
    private MenuService menuService;

    @GetMapping("/getFood")
    public List<MenuItem> getFood() {
        return this.menuService.getFoodItems();
    }

    @GetMapping("/getDrinks")
    public List<MenuItem> getDrinks() {
        return this.menuService.getDrinkItems();
    }

    @PostMapping("/addMenuItem")
    public @ResponseBody String addFoodItem(
            @RequestBody MenuItem menuItem
            ) {
        return this.menuService.addMenuItem(menuItem.getName(), menuItem.getDescription(), menuItem.getPrice(), menuItem.getType());
    }

    @PostMapping("/validateUser")
    public boolean validateUser() {
        // for now just return true
        // could create a ValidationObject with username/password/login attempts
        return true;
    }

    @PostMapping("/createAccount")
    public boolean createAccount(@RequestBody UserAccount newUser) {
        // need to persist in database, check if user already exists
        // for now just returning true
        return true;
    }

    private List<MenuItem> getMockFoodData() {
        return null;
    }

    private List<MenuItem> getMockDrinkData() {
        return null;
    }
}

