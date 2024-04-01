package model;

public class Truck implements Vehicle{
    private String brand;
    private String model;
    private int year;

    public Truck(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println(model + " " + brand  + "" + year + " Truck is hauling");
    }

    @Override
    public void stop() {
        System.out.println(model + " " + brand  + "" + year + " 1Truck is coming to a stop");
    }
}