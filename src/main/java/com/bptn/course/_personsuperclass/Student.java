package com.bptn.course._personsuperclass;

public class Student extends Person {
    private int id;

    public Student(String name, int id) {
        super(name);
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + " " + id;
    }
}