package com.company;
// Create a project in IntelliJ called BookApplication.
//
// Create a Book class that allows for Book title, author, description, price and isInStock variables
//
// The Book class shall contain private member variables, a default constructor,
// an overloaded constructor and a method called getDisplayText()
// which prints the author, title and description.
//
//
// The application shall also contain getters and setters for each private member variable.
//
// Create another class called BookApp which contains the main method.
// In the main method you shall create an instance of a Book and print the Author, Title and Description.
//

public class Main {

    public static void main(String[] args) {

        Book book = new Book();
	    book.setAuthor("Bishop Briggs");
	    book.setBookTitle("Big bird and the primes");
	    book.setDescription("Big bird hates his life, oh well! Couldn't be me :)");

	    book.getDispalyText();
    }
}
