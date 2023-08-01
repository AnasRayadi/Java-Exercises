package com.JavaExercises;

public class Main {
    public static void main(String[] args) {
        /**Class Car*/
        //var myCar=new Car("Toyota",50_000, Car.EngineType.DIESEL);
        //var myCar=new Car();
        //myCar.setManufacturer("Toyota");
        //myCar.setPrice(50_000);
        //myCar.setEngineType(Car.EngineType.HYBRID);
        //System.out.println(myCar.toString());
        //System.out.println(myCar.getManufacturer());
        //System.out.println(myCar.getPrice());
        //System.out.println(myCar.getEngineType());

        CarDealership dealership=new CarDealership("Agency1",3);
        dealership.addCarsToStock(new Car("Toyota",60_000, Car.EngineType.PETROL));
        dealership.addCarsToStock(new Car("Audi",750_000, Car.EngineType.DIESEL));
        dealership.addCarsToStock(new Car("BMW",190_000, Car.EngineType.DIESEL));
        //dealership.addCarsToStock(new Car("Peugeot",80_000, Car.EngineType.PETROL));
        System.out.println("####################");
        System.out.println("The Dealership: "+dealership.getName());
        Car[] carsInStock= dealership.getCarsOnStock();
        for(Car car:carsInStock){
            if(car!=null){
                System.out.println(car.toString());
                System.out.println("--------------------------------");
            }
        }
    }
}
