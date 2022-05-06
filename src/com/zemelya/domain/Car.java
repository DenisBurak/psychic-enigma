package com.zemelya.domain;

import java.util.Objects;

public class Car implements CarsMovements {
  private String brand;
  private String model;
  private int doors;
  private double engineVolume;
  private String type;
  private String manufactureCountry;
  private int yearOfCreation;

  public Car() {
    this.brand = "-";
    this.model = "-";
    this.doors = 0;
    this.engineVolume = 0.0;
    this.type = "-";
    this.manufactureCountry = "-";
    this.yearOfCreation = 1;
  }

  public Car(
      String brand,
      String model,
      int doors,
      double engineVolume,
      String type,
      String manufactureCountry,
      int yearOfCreation) {
    this.doors = doors;
    this.engineVolume = engineVolume;
    this.type = type;
    this.manufactureCountry = manufactureCountry;
    this.yearOfCreation = yearOfCreation;
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public double getEngineVolume() {
    return engineVolume;
  }

  public void setEngineVolume(double engineVolume) {
    this.engineVolume = engineVolume;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getManufactureCountry() {
    return manufactureCountry;
  }

  public void setManufactureCountry(String manufactureCountry) {
    this.manufactureCountry = manufactureCountry;
  }

  public int getYearOfCreation() {
    return yearOfCreation;
  }

  public void setYearOfCreation(int yearOfCreation) {
    this.yearOfCreation = yearOfCreation;
  }

  @Override
  public String toString() {
    return "Car{"
        + "brand='"
        + brand
        + '\''
        + ", model='"
        + model
        + '\''
        + ", doors="
        + doors
        + ", engineVolume="
        + engineVolume
        + ", type='"
        + type
        + '\''
        + ", manufactureCountry='"
        + manufactureCountry
        + '\''
        + ", yearOfCreation="
        + yearOfCreation
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return doors == car.doors &&
            Double.compare(car.engineVolume, engineVolume) == 0 &&
            yearOfCreation == car.yearOfCreation &&
            Objects.equals(brand, car.brand) &&
            Objects.equals(model, car.model) &&
            Objects.equals(type, car.type) &&
            Objects.equals(manufactureCountry, car.manufactureCountry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, model, doors, engineVolume, type, manufactureCountry, yearOfCreation);
  }

  public void run() {
    System.out.println("Run: " + getBrand() + " " + getModel());
  }

  public int move() {
    return (int) (1 + Math.random() * 200);
  }
}

