package com.food;

import java.util.List;
import java.util.Random;

public class DeliveryZone {
    private final String id;
    private final String name;
    private final List<String> streets;

    public DeliveryZone(String name, List<String> streets) {
        this.id = String.valueOf(new Random().nextInt());
        this.name = name;
        this.streets = streets;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getStreets() {
        return streets;
    }

    public Boolean checkStreet(String street) {
        return getStreets().contains(street);
    }
}
