
import java.util.*;

/**
 * The Class BooksCatalogueISBN.
 */
public class BooksCatalogueISBN {
	
	/** The books. */
	private Map<Integer, BookWithISBN> books = new HashMap<>();
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 */
	public void addBook(BookWithISBN book) {
		if(books.containsKey(book.getISBN()))
			throw new IllegalArgumentException("ERROR: Book already exists in catalogue.");
		
		books.put(book.getISBN(), book);
		System.out.println("Added item - " + book.toString());
	}
	
	/**
	 * Removes the book.
	 *
	 * @param book the book
	 */
	public void removeBook(BookWithISBN book) {
		if(!books.containsKey(book.getISBN()))
			throw new IllegalArgumentException("ERROR: Book does not exist in catalogue.");
		
		books.remove(book.getISBN());
		System.out.println("Removed item - " + book.toString());
		
	}
	
	/**
	 * Gets the book.
	 *
	 * @param ISBN the isbn
	 * @return the book
	 */
	public BookWithISBN getBook(Integer ISBN) {
		if(!books.containsKey(ISBN))
			throw new IllegalArgumentException("ERROR: This book does not exist");
			
		return books.get(ISBN);
	}

}
