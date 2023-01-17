package com.example.javacoffeespring.models;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
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
    @Column(name = "item_type")
    private String type;

    public MenuItem() {
    }

    public MenuItem(String name) {
        super();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return this.price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }

    public long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }
    public void setMenuItemType(String menuItemType) {
        this.type = menuItemType;
    }

}
