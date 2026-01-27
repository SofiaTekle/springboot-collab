package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.sofia.springbootcollab.model.Course;

import java.util.List;

@Controller
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    public String getCourses(Model model) {

        List<Course> courses = List.of(
                new Course(1, "Java", 7),
                new Course(2, "Webbutveckling", 10),
                new Course(3, "Databaser", 5)
        );

        model.addAttribute("courses", courses);
        return "courses";
    }


}
