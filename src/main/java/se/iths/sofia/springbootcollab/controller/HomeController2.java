package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootcollab.model.Persons;

import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController2 {


    @GetMapping
    public String home(Model model) {
        model.addAttribute("greeting", "Välkommen");
        return "home";
    }

    @GetMapping("/persons")
    public String getPersons(Model model) {

        List<Persons> persons = List.of(
                new Persons("Anna", "Eriksson", 25, "anna.eriksson@gmail.com"),
                new Persons("Erik", "Eriksson", 30, "erik.eriksson@yahoo.com"),
                new Persons("Samuel", "Svensson", 28, "sara.svensson@gmail.com")
        );

        model.addAttribute("persons", persons);
        return "persons";
    }

}
