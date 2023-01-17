package com.example.javacoffeespring.models;

public class MenuItem {

    private String name;
    private String description;
    private Float price;

    public MenuItem(String name, String description, Float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Float getPrice() {
        return this.price;
    }

}
