package se.iths.sofia.springbootcollab.model;

public class Student {
    private String firstName;
    private String lastName;
    private String program;

    public Student(String firstName, String lastName, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.program = program;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getProgram() {
        return program;
    }
}
