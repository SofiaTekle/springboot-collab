package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootcollab.model.City;

import java.util.List;

@Controller
@RequestMapping("/cities")
public class CityController {

    @GetMapping
    public String getCities(Model model) {

        List<City> cities = List.of(
                new City(1, "Stockholm", 975000),
                new City(2, "Göteborg", 580000),
                new City(3, "Malmö", 350000)
        );

        model.addAttribute("cities", cities);
        return "cities";
    }


}
