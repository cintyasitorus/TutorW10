package model;

public class Motor implements Vehicle{
    private String brand;
    private String model;
    private int year;

    public Motor(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public void drive() {
        System.out.println(model + " " + brand  + "" + year+ " Motor is revving");
    }

    @Override  
    public void stop() {
        System.out.println(model + " " + brand  + "" + year + " Motor is slowing down");
    }
}