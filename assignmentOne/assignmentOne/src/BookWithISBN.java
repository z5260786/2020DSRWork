
// TODO: Auto-generated Javadoc
/**
 * The Class BookWithISBN.
 */
public class BookWithISBN extends Book {
	
	/** The isbn. */
	private int ISBN;

	/**
	 * Instantiates a new book with ISBN.
	 *
	 * @param title the title
	 * @param author the author
	 * @param ISBN the isbn
	 */
	public BookWithISBN(String title, String author, Integer ISBN) {
		super(title, author);
		if(ISBN == null)
			throw new IllegalArgumentException("ERROR: ISBN cannot be null");
		
		this.ISBN = ISBN;
	}
	
	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public int getISBN() {
		return this.ISBN;
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
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookWithISBN other = (BookWithISBN) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	
	

}
