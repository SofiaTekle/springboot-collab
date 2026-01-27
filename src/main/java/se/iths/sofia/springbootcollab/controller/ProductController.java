package se.iths.sofia.springbootcollab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.sofia.springbootcollab.model.Product;

import java.util.List;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String products(Model model) {

        List<Product> products = List.of(
                new Product("Mobiltelefon", "Samsung Galaxy S24", 12999.0),
                new Product("Surfplatta", "iPad", 14999.0),
                new Product("Laptop", "Acer Aspire", 16999.0)
        );
        model.addAttribute("products", products);
        return "products";

    }


}
