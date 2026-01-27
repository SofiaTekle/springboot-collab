package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Person;

import java.util.List;

@Controller
public class PersonController {

    @GetMapping("/persons")
    public String getPersons(Model model) {

        List<Person> persons = List.of(
                new Person("Anna", "Eriksson", 25, "anna.eriksson@gmail.com"),
                new Person("Erik", "Eriksson", 30, "erik.eriksson@yahoo.com"),
                new Person("Sara", "Svensson", 28, "sara.svensson@gmail.com")
        );

        model.addAttribute("persons", persons);

        return "persons";
    }
}
