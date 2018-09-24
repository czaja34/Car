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
            result = true;
        } else {
            System.out.println(" no identico");

        }

        return result;
    }

    public int getAverageCounterPerYear() {

        return counter / (2018 - year);
    }

    public String getFullCarName() {

        return brand + " " + model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
