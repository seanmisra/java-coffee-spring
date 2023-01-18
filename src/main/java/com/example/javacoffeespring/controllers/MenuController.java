package com.example.javacoffeespring.controllers;
import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.models.UserAccount;
import com.example.javacoffeespring.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return this.menuService.addMenuItem(menuItem);
    }

    private List<MenuItem> getMockFoodData() {
        return null;
    }

    private List<MenuItem> getMockDrinkData() {
        return null;
    }
}

