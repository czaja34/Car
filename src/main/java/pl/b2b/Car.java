package pl.b2b;

import pl.b2b.components.Engine;

public class Car {

    private Engine engine;
    private String color;
    private String brand;
    private String model;
    private int counter;
    private int year;

    public Car(Engine engine, String color, String brand, String model, int counter, int year) {
        this.engine = engine;
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.counter = counter;
        this.year = year;
    }
}
