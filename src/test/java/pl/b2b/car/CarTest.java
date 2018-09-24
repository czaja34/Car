package pl.b2b.car;

import org.junit.Before;
import org.junit.Test;
import pl.b2b.components.Engine;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car = new Car();
    Car carBmw;
    Car carToyota;
    Engine engineForBmw;
    Engine engineForToyota;

    @Before
    public void setUp() {
        engineForBmw = new Engine("diesel", 1.9, 165);
        carBmw = new Car(engineForBmw, "red", "BMW", "E36", 217000, 2001);

        engineForToyota = new Engine("bp", 2.0, 180);
        carToyota = new Car(engineForToyota, "blue", "Toyota", "Avensis", 180000, 2003);
    }

    @Test
    public void compareCarTest() {
        assertEquals(false, car.compareCar(carBmw, carToyota));
        assertEquals(true, car.compareCar(carToyota, carToyota));
    }

    @Test
    public void AverageCounterPerYearTest() {
        assertEquals(12764, carBmw.getAverageCounterPerYear());
        assertEquals(12000, carToyota.getAverageCounterPerYear());
    }

    @Test
    public void fullNameTest() {
        assertEquals("Toyota Avensis", carToyota.getFullCarName());
        assertEquals("BMW E36", carBmw.getFullCarName());
    }

    @Test
    public void efficiencyTest() {
        assertEquals(0.0111, carToyota.getEngine().efficiency(), 4);
        assertEquals(0.0115, carBmw.getEngine().efficiency(), 4);
    }

    @Test
    public void getterTest() {
        assertEquals(engineForToyota, carToyota.getEngine());
        assertEquals("blue", carToyota.getColor());
        assertEquals("Toyota", carToyota.getBrand());
        assertEquals("Avensis", carToyota.getModel());
        assertEquals(180000, carToyota.getCounter());
        assertEquals(2003, carToyota.getYear());
    }

    @Test
    public void setterTest() {
        carToyota.setEngine(engineForBmw);
        carToyota.setColor("red");
        carToyota.setBrand("BMW");
        carToyota.setModel("Auris");
        carToyota.setCounter(12345);
        carToyota.setYear(2000);

        assertEquals(engineForBmw, carToyota.getEngine());
        assertEquals("red", carToyota.getColor());
        assertEquals("BMW", carToyota.getBrand());
        assertEquals("Auris", carToyota.getModel());
        assertEquals(12345, carToyota.getCounter());
        assertEquals(2000, carToyota.getYear());
    }

}