package br.com.inventory.carinventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars-inventory")
public class CarInventoryResource {

    private CarService carService;

    public CarInventoryResource(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> listByModel(@RequestParam String model) {
        return this.carService.listByModel(model);
    }
}
