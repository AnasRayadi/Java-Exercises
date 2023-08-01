package com.JavaExercises;

public class Car {
    private String manufacturer;
    private double price;
    private EngineType engineType;
    public Car(){

    }
    public Car(String manufacturer ,double price, EngineType engineType){
        this.manufacturer=manufacturer;
        this.price=price;
        this.engineType=engineType;
    }
    public enum EngineType{
        PETROL, ELECTRIC, DIESEL, HYBRID
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public double getPrice(){
        return price;
    }
    public EngineType getEngineType(){
        return engineType;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setEngineType(EngineType engineType){
        this.engineType=engineType;
    }
    @Override
    public String toString(){
        return "The Manufacturer of the car: "+manufacturer+"\nPrice: "+price+"\nEngine Type: "+engineType;
    }
}
