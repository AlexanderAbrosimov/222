package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService{



    public static List<Car> subCarList(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", "Type1", 1));
        cars.add(new Car("Car2", "Type2", 2));
        cars.add(new Car("Car3", "Type3", 3));
        cars.add(new Car("Car4", "Type4", 4));
        cars.add(new Car("Car5", "Type5", 5));
        return cars.subList(0, ((count > 5) | (count < 0)) ? 5 : count);
    }
}
