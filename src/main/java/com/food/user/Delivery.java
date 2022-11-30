package com.food.user;

import com.food.DeliveryZone;

import java.util.List;

public class Delivery extends User {
    private final List<DeliveryZone> deliveryZones;

    public Delivery(String name,
                    String email,
                    String phone,
                    List<DeliveryZone> deliveryZones) {
        super(name, email, phone);
        this.role = Role.DELIVERY;
        this.deliveryZones = deliveryZones;
    }

    public List<DeliveryZone> getDeliveryZones() {
        return deliveryZones;
    }

    public void contactCustomer(Customer customer) {

    }


}
