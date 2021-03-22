import java.util.Comparator;

/**
 * The Class Book.
 */
public class Book {

	/** The book title. */
	private String bookTitle;
	
	/** The book author. */
	private String bookAuthor;
	
	/**
	 * Instantiates a new book.
	 *
	 * @param title the title
	 * @param author the author
	 */
	public Book(String title, String author) {
		
		setTitle(title);
		setAuthor(author);
		
		System.out.println("Successfully added - " + this.toString());
	}
	
	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		if(title == null || title.isEmpty())
			throw new IllegalArgumentException("Error: Invalid input - Provide a book title");
		
		bookTitle = title;
	}
	
	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		if(author == null || author.isEmpty() || !(author.matches("^[a-zA-Z\\s?]+")))
			throw new IllegalArgumentException("Error: Invalid input, author must not be empty and only contain characters - a-z and A-Z characters only.");
		
		bookAuthor = author;
	}
	
	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return bookTitle;
	}
	
	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return bookAuthor;
	}

	/* 
	 * Checks equality of a book to another object
	 * 
	 * @param obj the comparable object
	 * @return equality 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bookAuthor == null) {
			if (other.bookAuthor != null)
				return false;
		} else if (!bookAuthor.equals(other.bookAuthor))
			return false;
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		return true;
	}

	/* 
	 * Returns the book details as a string
	 * 
	 * @return book string 
	 */
	public String toString() {
		return "\'" + bookTitle + "\' by " + bookAuthor;
	}
}

/*
 * A series of classes to use as comparators for sorting
 * 
 * Sorts as title ascending/descending and author ascending/descending
 */

class TitleSortA implements Comparator<Book> {

	@Override
	public int compare(Book bookA, Book bookB) {
		return bookA.getTitle().compareToIgnoreCase(bookB.getTitle());
	}
	
}

class TitleSortD implements Comparator<Book> {

	@Override
	public int compare(Book bookA, Book bookB) {
		return bookB.getTitle().compareToIgnoreCase(bookA.getTitle());
	}
	
}

class AuthorSortA implements Comparator<Book> {

	@Override
	public int compare(Book bookA, Book bookB) {
		return bookA.getAuthor().compareToIgnoreCase(bookB.getAuthor());
	}
	
}

class AuthorSortD implements Comparator<Book> {

	@Override
	public int compare(Book bookA, Book bookB) {
		return bookB.getAuthor().compareToIgnoreCase(bookA.getAuthor());
	}
	
}
