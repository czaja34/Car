package pl.b2b.car;

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

    public Car() {
    }


    public boolean compareCar(Car car1, Car car2) {

        boolean result = false;

        if (car1.equals(car2)) {
            System.out.println("identico");

        } else {
            System.out.println(" no identico");

        }

        return result;
    }

    public int getAverageCounterPerYear() {

        return 0;
    }

    public String getFullCarName() {

        return "";
    }


}
