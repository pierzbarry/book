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
// Create a method that returns the pricing for a requested number of books.
// Five books at $20.00 should return $100, if they are in stock.
// If they are not in stock, that should be handled appropriately (hint - you decide).
//

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//		Book book = new Book("Yusuf the Executor", "P-Diddy", "This book is literally just about some kid running around and murdering people. yike", 12.50, true);
//		book.getDisplayText();

    	ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Big Bird and the Primes", "Bishop Briggs",
				"Big bird hates his life, oh well! Couldn't be me :)", 5, true));
		list.add(new Book("Yusuf the Executor", "P-Diddy",
				"This book is literally just about some kid running around and murdering people. Yike.", 12.50, true));
		list.add(new Book("Yellow Tears", "Yosemite Brown",
				"It's a biography about how the author is super dehydrated.", 20, true));
		list.add(new Book("Hey guy!", "Moe Beau", "It's a sad book ok", 22, true));

		double sum = 0;

		for (Book b : list) {
			b.getDisplayText();
			double priceOfThisBook = b.total(b.getPrice());
			sum += priceOfThisBook;
		}
		System.out.println("Total cost: $" + sum + "0");
    }
}
