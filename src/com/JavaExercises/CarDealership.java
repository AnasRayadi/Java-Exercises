package com.JavaExercises;

public class CarDealership {
    private String name;
    private int maxCarsOnDisplay;
    private Car[] carsOnStock;
    public CarDealership(String name,int maxCarsOnDisplay){
        this.name=name;
        this.maxCarsOnDisplay=maxCarsOnDisplay;
        this.carsOnStock=new Car[maxCarsOnDisplay];
    }
    public String getName(){
        return name;
    }
    public int getMaxCarsOnDisplay(){
        return maxCarsOnDisplay;
    }
    public Car[] getCarsOnStock(){
        return carsOnStock;
    }
    // Method to add cars to the Dealership stock
    public void addCarsToStock(Car car){
        int currentCarsInStock=getNumberOfCarsInStock();
        if(currentCarsInStock<maxCarsOnDisplay){
            carsOnStock[currentCarsInStock]=car;
            System.out.println("Done the car added successfully!");
        }else {
            System.out.println("Sorry, the maximum capacity of cars on display has been reached.");
        }
    }
    // Method to get the number of cars in stock
    public int getNumberOfCarsInStock() {
        int count = 0;
        for (Car car : carsOnStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
    public Car findCarByManufacturer(String manufacturer) {
        //Car[] car=getCarsOnStock();
        for (Car car : carsOnStock) {
            if (car !=null && car.getManufacturer().equals(manufacturer))
                return car;
        }
        return null;
    }

}


