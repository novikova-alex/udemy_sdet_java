package booksmanagement;

import java.util.Arrays;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
    	if (author == null || books == null) {
			return new Book[0];
		}
    	Book[] filteredBooksByAuthor = new Book[books.length];
		int indexForFilteredBooks = 0;
		for(int i = 0; i < books.length; i++) 
			for(int j = 0; j < books[i].authors.length; j++) 
				if (books[i].authors[j].equals(author)) {
					filteredBooksByAuthor[indexForFilteredBooks] = books[i];
					indexForFilteredBooks++;
					break;
				}
		return Arrays.copyOf(filteredBooksByAuthor, indexForFilteredBooks);			
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		if (publisher == null || books == null) {
			return new Book[0];
		}
		Book[] filteredBooksByPublisher = new Book[books.length];
		int indexForFilteredBooks = 0; 
		for (int i = 0;  i < books.length; i++) {
			if(books[i].publisher.equals(publisher)) {
				filteredBooksByPublisher[indexForFilteredBooks] = books[i];
				indexForFilteredBooks++;
			}
		}
		return Arrays.copyOf(filteredBooksByPublisher, indexForFilteredBooks);	
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		if (books == null) {
			return new Book[0];
		}
		Book[] filteredBooksByYear = new Book[books.length];
		int indexForFilteredBooks = 0; 
		for (int i = 0;  i < books.length; i++) {
			if(books[i].publishingYear >= yearFromInclusively) {
				filteredBooksByYear[indexForFilteredBooks] = books[i];
				indexForFilteredBooks++;
			}
		}
		return Arrays.copyOf(filteredBooksByYear, indexForFilteredBooks);	
	}
	
}
