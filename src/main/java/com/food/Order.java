package com.food;

import com.food.user.Customer;
import com.food.user.Delivery;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Order {
    private final String id;
    private final Customer customer;
    private final String street;
    private final String houseNumber;
    private final LocalDateTime createdAt;
    private final Map<Dish, Integer> items;

    public Customer getCustomer() {
        return customer;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    private Delivery delivery;
    private OrderStatus status;
    private LocalDateTime updatedAt;
    private Integer rating;

    public Order(Customer customer,
                 String street,
                 String houseNumber,
                 OrderStatus status) {
        this.id = String.valueOf(new Random().nextInt());
        this.customer = customer;
        this.street = street;
        this.houseNumber = houseNumber;
        this.status = status;
        this.createdAt = LocalDateTime.now();
        this.items = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Map<Dish, Integer> getItems() {
        return items;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    public Boolean checkValidItems() {
        return null;
    }
}
