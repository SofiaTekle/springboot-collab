package se.iths.sofia.springbootcollab.model;

public class Course {

    private int id;
    private String name;
    private int credits;

    public Course() {
    }

    public Course(int id, String name, int credits) {
        this.id = id;
        this.name = name;
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
