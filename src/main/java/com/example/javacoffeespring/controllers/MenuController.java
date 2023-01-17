package com.example.javacoffeespring.controllers;

import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.models.UserAccount;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
public class MenuController {

    @GetMapping("/getFood")
    public ArrayList<MenuItem> getFood() {
        return this.getMockFoodData();
    }

    @GetMapping("/getDrinks")
    public ArrayList<MenuItem> getDrinks() {
        return this.getMockDrinkData();
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

    private ArrayList<MenuItem> getMockFoodData() {
        MenuItem foodOne = new MenuItem("Grilled Cheese",
                "Provolone, parmesan, mozzarella, American cheese and our fan-favorite sourdough bread", 7.99F);

        MenuItem foodTwo = new MenuItem("Croque Monsieur",
                "Grilled cheese with hickory-smoked ham and bechamel sauce", 13.99F);

        MenuItem foodThree = new MenuItem("Tomato Soup", "Creamy and delicious, with oregano, pepper, and garlic croutons", 4.99F);

        ArrayList<MenuItem> mockFoodItems = new ArrayList<>();
        mockFoodItems.add(foodOne);
        mockFoodItems.add(foodTwo);
        mockFoodItems.add(foodThree);

        return mockFoodItems;
    }

    private ArrayList<MenuItem> getMockDrinkData() {
        MenuItem drinkOne = new MenuItem("Coffee",
                "Our signature house blend, available with milk, cream, and sugar", 2.99F);

        MenuItem drinkTwo = new MenuItem("Iced Coffee",
                "Freshly brewed signature coffee, served chilled with a touch of sweetner", 3.99F);

        MenuItem drinkThree = new MenuItem("Cold Brew",
                "Slow-steeped for 24 hours, made from our signature house blend", 4.99F);

        MenuItem drinkFour = new MenuItem("Cortado",
                "2 shots of expresso, mixed with steamed milk and a slight hint of cocoa", 4.25F);

        MenuItem drinkFive = new MenuItem("Red Eye",
                "4 shots of expresso, with with our house-blend coffee, topped with foamed milk and sprinkling of cinnamon", 5.25F);

        ArrayList<MenuItem> mockDrinkItems = new ArrayList<>();
        mockDrinkItems.add(drinkOne);
        mockDrinkItems.add(drinkTwo);
        mockDrinkItems.add(drinkThree);
        mockDrinkItems.add(drinkFour);
        mockDrinkItems.add(drinkFive);

        return mockDrinkItems;
    }
}

