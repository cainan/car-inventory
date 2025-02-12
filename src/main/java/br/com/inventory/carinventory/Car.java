package br.com.inventory.carinventory;

import java.util.Random;

public class Car {

    public Car(String make, String model, Long year, String fuelType) {
        this.id = new Random().nextLong(0, 2000);
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public Long id;
    public String make;
    public String model;
    public Long year;
    public String fuelType;
}
