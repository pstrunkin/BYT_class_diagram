package com.food.user;

import java.util.List;

public class Customer extends User {

    private final List<String> addresses;

    public Customer(String name, String email, String phone, List<String> addresses) {
        super(name, email, phone);
        this.addresses = addresses;
    }

    public List<String> getAddresses() {
        return addresses;
    }

    public void contactDelivery(Delivery delivery) {

    }

    public void contactSupport() {

    }


}
