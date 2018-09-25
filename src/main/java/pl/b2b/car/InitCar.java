package pl.b2b.car;

import pl.b2b.components.Engine;

public class InitCar {
    public void init() {
        Car compareCar = new Car();

        Engine engineForBmw = new Engine("diesel", 1.9, 165);
        Car carBmw = new Car(engineForBmw, "red", "BMW", "e36", 217000, 2001);


    }
}
