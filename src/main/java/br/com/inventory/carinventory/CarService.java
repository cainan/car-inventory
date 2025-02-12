package br.com.inventory.carinventory;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    public List<Car> listByModel(String model) {
        return this.cars()
                .stream()
                .filter(c -> c.model.equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    public List<Car> cars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("VW", "Gol", 2008L, "Gas"));
        cars.add(new Car("VW", "Gol", 2017L, "Gas"));
        cars.add(new Car("VW", "Polo", 2022L, "Gas"));
        cars.add(new Car("VW", "Nivus", 2021L, "Gas"));
        cars.add(new Car("VW", "Nivus", 2021L, "Gas"));
        cars.add(new Car("Ford", "Fiesta", 2021L, "Gas"));
        cars.add(new Car("Ford", "Focus", 2018L, "Gas"));
        cars.add(new Car("Ford", "Fiesta", 2007L, "Gas"));
        cars.add(new Car("GM", "Cruze", 2014L, "Gas"));
        cars.add(new Car("GM", "Corsa", 2007L, "Gas"));
        cars.add(new Car("BMW", "320I", 2021L, "Gas"));
        cars.add(new Car("BMW", "118I", 2014L, "Gas"));
        cars.add(new Car("Mercedes-Benz", "CLA200", 2021L, "Gas"));
        cars.add(new Car("Mercedes-Benz", "C180", 2015L, "Gas"));
        cars.add(new Car("Kia", "Ceratto", 2011L, "Gas"));
        cars.add(new Car("VW", "T-CROSS", 2021L, "Gas"));
        cars.add(new Car("Fiat", "Punto", 2012L, "Gas"));
        cars.add(new Car("Fiat", "Stilo", 2007L, "Gas"));
        cars.add(new Car("Fiat", "Palio", 2021L, "Gas"));
        cars.add(new Car("Fiat", "Palio", 2022L, "Gas"));
        return cars;
    }
}
