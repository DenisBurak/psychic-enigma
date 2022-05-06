package com.zemelya.domain;

import java.util.Comparator;

public class CarComporator implements Comparator<Car> {

    public int compare(Car a, Car b){
        return Integer.compare(a.getYearOfCreation(), b.getYearOfCreation());
    }
}
