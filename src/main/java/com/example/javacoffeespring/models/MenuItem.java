package com.example.javacoffeespring.models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
@Table
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "item_name")
    private String name;
    @Column(name = "item_desc")
    private String description;
    @Column(name = "price")
    private Float price;

    public MenuItem() {
    }

    public MenuItem(String name, String description, Float price) {
        super();
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

    public long getId() {
        return this.id;
    }

}
