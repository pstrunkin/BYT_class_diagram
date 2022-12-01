package com.food;

import java.math.BigDecimal;
import java.util.Random;

public class Dish {
    private final String id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private Integer availableQuantity;

    public Dish(String name, String description, BigDecimal price, Integer availableQuantity) {
        this.id = String.valueOf(new Random().nextInt());
        this.name = name;
        this.description = description;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public Boolean checkAvailability(Integer quantity) {
        return this.availableQuantity >= quantity;
    }
}
