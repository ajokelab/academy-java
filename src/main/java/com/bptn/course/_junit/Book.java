package com.bptn.course._junit;

public class Book {
    // Define two private instance variables
    private String title;
    private double price;

    // Constructor
    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Method to return book info
    public String getBookInfo() {
        return title + "-" + price;
    }
}

