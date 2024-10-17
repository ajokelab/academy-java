package com.bptn.course._junit;

public class Main {
    // Do not modify this code. Please update the other files in the tabs above.
    public static void main(String[] args) {
        TextBook tb = new TextBook("Computer Science", 14.99, 9);
        TextBook tb2 = new TextBook("Basketweaving", 19.99, 2);

        System.out.println("Title: " + tb.getTitle());
        System.out.println("Edition: " + tb.getEdition());
        System.out.println("Book Info: " + tb.getBookInfo());
        System.out.println("Can substitute for tb2: " + tb.canSubstituteFor(tb2));

        System.out.println("\nTitle: " + tb2.getTitle());
        System.out.println("Edition: " + tb2.getEdition());
        System.out.println("Book Info: " + tb2.getBookInfo());
        System.out.println("Can substitute for tb: " + tb2.canSubstituteFor(tb));
    }
}
