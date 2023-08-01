package com.JavaExercises;

public class Main {
    public static void main(String[] args) {
        /**Class Car and Car Dealership*/
        //var myCar=new Car("Toyota",50_000, Car.EngineType.DIESEL);
        //var myCar=new Car();
        //myCar.setManufacturer("Toyota");
        //myCar.setPrice(50_000);
        //myCar.setEngineType(Car.EngineType.HYBRID);
        //System.out.println(myCar.toString());
        //System.out.println(myCar.getManufacturer());
        //System.out.println(myCar.getPrice());
        //System.out.println(myCar.getEngineType());

        /*CarDealership dealership=new CarDealership("Agency1",6);
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
        //System.out.println("Number of cars is: "+dealership.getNumberOfCarsInStock());
        //dealership.addCarsToStock(new Car("Ford",65_000, Car.EngineType.PETROL));
        //System.out.println("Number of cars after adding the car is: "+dealership.getNumberOfCarsInStock());
        System.out.println(dealership.findCarByManufacturer("BMW"));*/

        var firstPerson=new Person("Anas","Rayadi", Person.Gender.MALE,"anasriyadi08@gmail.com");
        var secondPerson=new Person("Fatima","Alali", Person.Gender.FEMALE,"fatimaalali@gmail.com");
        System.out.println("First Name: "+firstPerson.getFirstName()+" \nLast Name: "+firstPerson.getLastName()+" \nGender: "
                +firstPerson.getGender().toString().substring(0,1)+firstPerson.getGender().toString().substring(1).toLowerCase());

    }
}
