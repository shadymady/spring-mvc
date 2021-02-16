package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{

    @Override
    public List<Car> listCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Lada", 2101));
        cars.add(new Car(2, "Lada", 2110));
        cars.add(new Car(3, "Lada", 2112));
        cars.add(new Car(4, "Lada", 2115));
        cars.add(new Car(5, "Lada", 2121));
        List<Car> cars1 = cars.stream().limit(count).collect(Collectors.toList());
        return count == 0 ? cars : cars1;
    }
}