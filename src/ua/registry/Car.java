package ua.registry;

import java.util.Objects;

public class Car {
    private String vin;
    private String plate;
    private String brand;
    private String model;
    private int year;
    private String color;
    private String ownerId;

    public Car() { }

    public Car(String vin, String plate, String brand, String model, int year, String color) {
        this.vin = vin;
        this.plate = plate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void scheduleInspection() { /* placeholder */ }
    public void markAsStolen() { /* placeholder */ }

    public String getVin() { return vin; }
    public void setVin(String vin) { this.vin = vin; }

    public String getPlate() { return plate; }
    public void setPlate(String plate) { this.plate = plate; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getOwnerId() { return ownerId; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", ownerId='" + ownerId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }
}
