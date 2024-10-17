package com.bptn.course._personsuperclass;

public class APStudent extends Student {
    private int apScore;

    // Parameterized constructor
    public APStudent(String name, int id, int apScore) {
        super(name, id); // Call the parent constructor
        this.apScore = apScore;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + " " + apScore;
    }
}