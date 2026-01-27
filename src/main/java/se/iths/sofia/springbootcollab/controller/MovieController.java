package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Movie;

import java.util.List;

@Controller
public class MovieController {

    @GetMapping("/movies")
    public String movies(Model model) {

        List<Movie> movies = List.of(
                new Movie("Harry Potter", 2001, "Fantasy"),
                new Movie("Good Will Hunting", 1998, "Drama"),
                new Movie("Inception", 2010, "Sci-Fi")
        );

        model.addAttribute("movies", movies);
        return "movies";
    }


}
