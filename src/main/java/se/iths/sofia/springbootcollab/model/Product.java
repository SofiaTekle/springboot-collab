package se.iths.sofia.springbootcollab.model;

public class Product {

    private String name;
    private String model;
    private double price;

    public Product(String name, String model, double price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
