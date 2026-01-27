package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Book;

import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public String books(Model model) {

        List<Book> books = List.of(
                new Book("Pride and Prejudice", "Jane Austen", 1813),
                new Book("Oliver Twist", "Charles Dickens", 1837),
                new Book("Mio, min Mio", "Astrid Lindgren", 1954)

        );
        model.addAttribute("books", books);

        return "books";
    }


}