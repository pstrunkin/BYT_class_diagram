package com.food.user;

import com.food.DeliveryZone;

public class Support extends User {

    public Support(String name, String email, String phone) {
        super(name, email, phone);
        this.role = Role.SUPPORT;
    }

    public void contactCustomer(Customer customer) {

    }

    public void contactDelivery(Delivery delivery) {

    }

    public Boolean checkDeliveryZone(Delivery delivery, DeliveryZone deliveryZone) {
        return null;
    }
}
