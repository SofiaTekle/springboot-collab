package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.User;

import java.util.List;

@Controller
public class UserController {


    @GetMapping("/users")
    public String getUsers(Model model) {
        List<User> users = List.of(
                new User(1L, "sofia", "sofia@example.com"),
                new User(2L, "alex", "alex@example.com"),
                new User(3L, "emma", "emma@example.com"),
                new User(4L, "anna", "anna@example.com")
        );

        model.addAttribute("users", users);
        return "users";
    }


}
