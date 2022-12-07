package com.food.user;

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

    public void contact() {
        System.out.println("Contacting: " + getName());
    }
}
