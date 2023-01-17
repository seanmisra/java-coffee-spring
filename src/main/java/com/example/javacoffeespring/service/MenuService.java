package com.example.javacoffeespring.service;

import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.controllers.MenuRepository;
import com.example.javacoffeespring.models.MenuItemType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

@Service
public class MenuService {

    @Autowired
    private MenuRepository repository;

    private List<MenuItem> getAllItems() {
        Iterable<MenuItem> allItemsIterable = repository.findAll();
        List<MenuItem> allItemsList = new ArrayList<>();
        allItemsIterable.forEach(allItemsList::add);

        return allItemsList;
    }

    public List<MenuItem> getFoodItems() {
        List<MenuItem> allItems = this.getAllItems();
        List<MenuItem> allFoodItems = allItems.stream().filter(
                item -> item.getType().toLowerCase().contains("food")).collect(Collectors.toList());

        return allFoodItems;
    }

    public List<MenuItem> getDrinkItems() {
        List<MenuItem> allItems = this.getAllItems();
        List<MenuItem> allDrinkItems = allItems.stream().filter(
                item -> item.getType().toLowerCase().contains("drink")).collect(Collectors.toList());

        return allDrinkItems;
    }

    public String addMenuItem(String name, String description, Float price, String menuItemType) {
        MenuItem menuItem = new MenuItem();
        menuItem.setName(name);
        menuItem.setDescription(description);
        menuItem.setPrice(price);
        menuItem.setMenuItemType(menuItemType);

        repository.save(menuItem);
        return "Success";
    }

}
