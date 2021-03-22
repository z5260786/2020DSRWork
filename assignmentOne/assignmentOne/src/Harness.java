import java.util.List;

/**
 * <p>
 * represents a harness class for testing all the methods implemented in the
 * ass1, 2020
 * </p>
 *
 * @author Saber Elsayed
 * @version Jan 2020
 *
 *
 */
public class Harness {


    /**
     * main program to create and test your program
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
   // 	Task1();
    	Task2();
  //  	Task3();
  //  	Task4();
  //  	Task5();
 //   	Task6();
    }

    /**
     * test Task 1
     */
    private static void Task1() {

        Book b = null;
        try {
        	b = new Book("", "v");
        } catch (Exception e) {
        	System.out.println("1: " + e.getMessage());
        }
        
        try {
        	b = new Book(null, "v");
        } catch (Exception e) {
        	System.out.println("2: " + e.getMessage());
        }

        try {
        	b = new Book("Hello DSR", "Saber Elsayed 3");
        } catch (Exception e) {
        	System.out.println("3: " + e.getMessage());
        }
        
        try {
        	b = new Book("Hello DSR2020!", "Saber Elsayed");
        } catch (Exception e) {
        	System.out.println("4: " + e.getMessage());
        }
        
        try {
        	b.setAuthor("Saber Elsayed!");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        try {
        	b.setTitle("Hello DSR2020!!");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }

    /**
     * test Task 2
     */
    private static void Task2() {

        BooksCatalogue bookList = new BooksCatalogue();
        
        Book b1 = null;
        
        try{
        	b1 = new Book("Book1", "Saber Elsayed");
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        try{
			bookList.addBook(b1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
        }
        

        try {
			bookList.removeBook(b1);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }

		try {
			bookList.addBook(b1);
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
		
		bookList.addBook(new Book("TITLE", "ETHAN"));
		bookList.addBook(new Book("DIIF", "ETHAN"));
		System.out.println(bookList.searchByAuthor("eth"));
		
		try{
			bookList.removeByAuthor("Saber");
		} catch (Exception e) {
        	System.out.println(e.getMessage());
        }

    }

    /**
     * test Task 3
     */
    private static void Task3() {

        BooksCatalogue bookList = new BooksCatalogue();
        Book b1 = new Book("Book1", "Saber Elsayed");
        Book b2 = new Book("A2", "Elsayed Saber");
        bookList.addBook(b1);
        bookList.addBook(b2);

        List<Book> s = bookList.searchByAuthor("Elsayed");
        int number = bookList.getNumberOfBooks("Elsay");
        System.out.println(number);
        number = bookList.getNumberOfBooksTitle("A2");
        s = bookList.searchByTitle("A2");

    }

    /**
     * testing Task 4
     */
    private static void Task4() {
        BooksCatalogue bookList = new BooksCatalogue();
        Book b1 = new Book("Book1", "Saber Elsayed");
        Book b2 = new Book("A2", "Elsayed Saber");
        bookList.addBook(b1);
        bookList.addBook(b2);

        System.out.print("Test: Add a book to reading books list\t "
                + "Expected: Book1, 2");

        bookList.addReadingBooks(b1);
        bookList.addReadingBooks(b2);
        bookList.addReadingBooks(b1);
        System.out.print(bookList.getReadingHistory() + "\t");

    }

    /**
     * Testing Task 5
     */
    private static void Task5() {

        BooksCatalogue bookList = new BooksCatalogue();
        Book b1 = new Book("B", "Saber Elsayed");
        Book b2 = new Book("C", "Charlie");
        Book b3 = new Book("A", "Ali");
        bookList.addBook(b1);
        bookList.addBook(b2);
        bookList.addBook(b3);

        System.out.println(bookList.sortByAuthorAscending());
        System.out.println(bookList.sortByAuthorDescending());
        System.out.println(bookList.sortByTitleAscending());
        System.out.println(bookList.sortByTitleDescending());

    }

    /**
     * Task 6
     */
    private static void Task6() {

        BooksCatalogueISBN bookList = new BooksCatalogueISBN();

        BookWithISBN b1 = new BookWithISBN("Book1", "Saber Elsayed", 1);

        bookList.addBook(b1);
        bookList.removeBook(b1);

        try {
        	BookWithISBN b = bookList.getBook(1);
        	System.out.println(b.toString());
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
