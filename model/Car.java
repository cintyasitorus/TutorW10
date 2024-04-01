package model;

public class Car implements Vehicle{
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println(model + " " + brand  + "" + year + " Car is accelerating");
    }

    @Override
    public void stop() {
        System.out.println(model + " " + brand  + "" + year  + " Car is braking");
    }
}