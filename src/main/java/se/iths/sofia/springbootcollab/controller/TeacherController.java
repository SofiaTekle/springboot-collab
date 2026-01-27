package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Teacher;

import java.util.List;

@Controller
public class TeacherController {

    @GetMapping("/teachers")
    public String getTeachers(Model model) {

        List<Teacher> teachers = List.of(
                new Teacher("Anna", "Lindborg", "Java"),
                new Teacher("Erik", "Nilsson", "Databaser"),
                new Teacher("Sara", "Lundberg", "Webbutveckling")
        );

        model.addAttribute("teachers", teachers);

        return "teacher";
    }
}
