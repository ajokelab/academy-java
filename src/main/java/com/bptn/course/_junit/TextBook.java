package com.bptn.course._junit;
public class TextBook extends Book {
    // Define a private int instance variable for edition
    private int edition;

    // Constructor
    public TextBook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;
    }

    // Override getBookInfo method
    @Override
    public String getBookInfo() {
        return super.getBookInfo() + "-" + edition;
    }

    // Method to return edition
    public int getEdition() {
        return edition;
    }

    // Method to determine if one textbook can substitute for another
    public boolean canSubstituteFor(TextBook other) {
        return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
    }
}

