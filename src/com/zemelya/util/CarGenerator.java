package com.zemelya.util;

import com.zemelya.domain.Car;
import com.zemelya.domain.CarsBrands;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class CarGenerator implements CarsBrands {
  private CarGenerator(){}
  public static List<Car> generateCars(int countOfCars) {
    String[] listOfCars = new String[]{VOLVO, FORD, MAZDA, OPEL, VEDRO, BENTLY, PEUGEOT, SUBARU, ISUZU};
    int sizeOfList = listOfCars.length;
    List<Car> cars = new ArrayList<>(sizeOfList);
    for (int i = 0; i < countOfCars; i++) {
      cars.add(
          new Car(
              listOfCars[(int) (1 + Math.random() * (sizeOfList - 1))],
              "Model-" + (int) (1 + Math.random() * 50),
              (int) (1 + Math.random() * 6),
              round(0.3 + Math.random() * 5.0),
              "Type",
              "manufactureCountry",
              (int) (1940 + Math.random() * 80)));
    }
    return cars;
  }

  static double round(double value) {
    return BigDecimal.valueOf(value).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
