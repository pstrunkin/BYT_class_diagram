package com.food.user;

import com.food.Order;

import java.util.List;
import java.util.Random;

public abstract class User {
    protected String id;
    protected String name;
    protected String email;
    protected String phone;
    protected Role role = Role.USER;

    public User(String name, String email, String phone) {
        this.id = String.valueOf(new Random().nextInt());
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Role getRole() {
        return role;
    }

    public Order createOrder(Order order) {
        return null;
    }

    public List<Order> getOrders() {
        return null;
    }

    public void cancelOrder(Order order) {
    }
}
