import java.util.*;

/**
 * The Class BooksCatalogue.
 */
public class BooksCatalogue {
	
	/** The book cat. */
	private List<Book> bookCat = new LinkedList<>();
	
	/** The reading history. */
	private List<Book> readingHistory = new LinkedList<>();

	/**
	 * Adds the book.
	 *
	 * @param b the book
	 */
	public void addBook(Book b) {
		if(bookCat.contains(b))
			throw new IllegalArgumentException("ERROR: Book already exists in catalogue.");
		
		bookCat.add(b);
		System.out.println("Added item - " + b.toString());
	}
	
	/**
	 * Removes the book.
	 *
	 * @param b the book
	 */
	public void removeBook(Book b) {
		if(!bookCat.contains(b))
			throw new IllegalArgumentException("ERROR: Book does not exist in catalogue.");
		
		bookCat.remove(b);
		System.out.println("Removed item - " + b.toString());
	}
	
	/**
	 * Removes the by author.
	 *
	 * @param author the author
	 */
	public void removeByAuthor(String author) {
		int count = 0;
		for(int i = 0; i < bookCat.size(); i++) {
			if(bookCat.get(i).getAuthor() == author) {
				bookCat.remove(i);
				i--;
				count++;
			}
		}
		
		switch (count) {
		case 0:
			System.out.println("No books by " + author + " found");
			break;
		case 1:
			System.out.println("Removed 1 book by " + author);
			break;
		default:
			System.out.println("Removed " + count + " books by " + author);
			break;
		}
		
		System.out.println("Removed books by " + author);
	}

	/**
	 * Search by author.
	 *
	 * @param name the name
	 * @return the list
	 */
	public List<Book> searchByAuthor(String author) {
		
		List<Book> temp = new LinkedList<>();
		
		for(int i = 0; i < bookCat.size(); i++) {
			if(bookCat.get(i).getAuthor().toLowerCase().contains(author.toLowerCase())) {
				temp.add(bookCat.get(i));
			}
		}
		
		return temp;
	}
	
	/**
	 * Gets the number of books.
	 *
	 * @param name the name
	 * @return the number of books
	 */
	public int getNumberOfBooks(String author) {
		return searchByAuthor(author).size();
	}

	/**
	 * Search by title.
	 *
	 * @param title the title
	 * @return the list
	 */
	public List<Book> searchByTitle(String title) {
		
		List<Book> temp = new LinkedList<>();
		
		for(int i = 0; i < bookCat.size(); i++) {
			if(bookCat.get(i).getTitle().toLowerCase().contains(title.toLowerCase())) {
				temp.add(bookCat.get(i));
			}
		}
		
		return temp;
	}
	
	/**
	 * Gets the number of books title.
	 *
	 * @param title the title
	 * @return the number of books title
	 */
	public int getNumberOfBooksTitle(String title) {
		return searchByTitle(title).size();
	}

	/**
	 * Adds the reading books.
	 *
	 * @param b the b
	 */
	public void addReadingBooks(Book b) {
		if(readingHistory.contains(b))
			readingHistory.remove(b);
		
		System.out.println("Added " + b.toString() + " to reading history");
		readingHistory.add(0, b);
	}
	
	/**
	 * Gets the reading history.
	 *
	 * @return the reading history
	 */
	public List<Book> getReadingHistory() {
		return readingHistory;
	}

	/**
	 * Sort by author ascending.
	 *
	 * @return the list
	 */
	public List<Book> sortByAuthorAscending() {
		
		List<Book> sort = bookCat;
		
		Collections.sort(sort, new AuthorSortA());
		
		return sort;
	}
	
	/**
	 * Sort by author descending.
	 *
	 * @return the list
	 */
	public List<Book> sortByAuthorDescending() {
		
		List<Book> sort = bookCat;

		Collections.sort(sort, new AuthorSortD());
		
		return sort;
	}
	
	/**
	 * Sort by title ascending.
	 *
	 * @return the list
	 */
	public List<Book> sortByTitleAscending() {
		
		List<Book> sort = bookCat;

		Collections.sort(sort, new TitleSortA());
		
		return sort;
	}
	
	/**
	 * Sort by title descending.
	 *
	 * @return the list
	 */
	public List<Book> sortByTitleDescending() {
		
		List<Book> sort = bookCat;

		Collections.sort(sort, new TitleSortD());
		
		return sort;
	}
}