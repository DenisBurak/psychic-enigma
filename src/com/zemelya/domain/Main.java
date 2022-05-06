package com.zemelya.domain;

import com.zemelya.util.CarGenerator;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    int count = 10;
    List<Car> cars = CarGenerator.generateCars(count);
    for (Car car : cars) {
      System.out.println(car);
    }

    System.out.println("Now we'll sort our list");
    CarComporator carComporator = new CarComporator();
    cars.sort(carComporator);

    for (Car car : cars) {
      System.out.println(car);
    }

    System.out.println("Now we'll call methods");
    for (Car car : cars) {
      CarsMovements service = car;
      service.run();
      System.out.println(
          "Speed of "
              + "\""
              + car.getBrand()
              + " "
              + car.getModel()
              + "\""
              + " = "
              + service.move());
    }
  }
}
