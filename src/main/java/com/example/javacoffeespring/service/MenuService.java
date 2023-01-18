package com.example.javacoffeespring.service;

import com.example.javacoffeespring.models.MenuItem;
import com.example.javacoffeespring.service.repository.MenuRepository;
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

    public String addMenuItem(MenuItem menuItem) {
        repository.save(menuItem);
        return "Success";
    }

}
