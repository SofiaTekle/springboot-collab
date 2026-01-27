package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Student;

import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getStudents(Model model) {

        List<Student> students = List.of(
                new Student("Alis", "Hanson", "Java"),
                new Student("Linda", "Svensson", "DevOps"),
                new Student("Noor", "Karlsson", "Frontend")
        );

        model.addAttribute("students", students);
        return "students";
    }
}
