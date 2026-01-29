package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootcollab.model.Persons;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {


    @GetMapping
    public String home(Model model) {
        model.addAttribute("greeting", "Välkommen Sedina");
        return "home";
    }


}
