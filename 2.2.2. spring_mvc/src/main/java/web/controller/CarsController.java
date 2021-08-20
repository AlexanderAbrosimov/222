package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {
    private CarService carService = new CarServiceImp();

    @GetMapping(value = "/cars")
    public String sayHello(@RequestParam("count") Optional<Integer> count, ModelMap model) {
        model.addAttribute("message", carService.subCarList(count.orElse(5)));
        return "cars";
    }
}
