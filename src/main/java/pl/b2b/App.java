package pl.b2b;


import pl.b2b.components.Engine;

public class App {
    public static void main(String[] args) {

        Engine engineForBmw = new Engine("diesel",1.9, 165);
        Car carBmw = new Car(engineForBmw, "red", "BMW","e36",217000,2001);

        Engine engineForToyota = new Engine("bp", 2.0,180);
        Car carToyota = new Car(engineForToyota, "blue", "Toyota", "avensis", 180000, 2003);

        if(carBmw.equals(carToyota)){
            System.out.println("identico");
        }else{
            System.out.println(" no identico");
        }

        if(carToyota.equals(carToyota)){
            System.out.println("identico");
        }else{
            System.out.println(" no identico");
        }

        if(carBmw.equals(carBmw)){
            System.out.println("identico");
        }else{
            System.out.println(" no identico");
        }

    }
}




