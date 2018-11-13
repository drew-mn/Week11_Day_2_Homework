import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1, book2, book3, book4, book5;

    @Before
    public void before(){
        library = new Library(5);

        book1 = new Book("Becoming", "Michelle Obama", "Autobiography");
        book2 = new Book("This is going to hurt", "Adam Kay", "Non-Fiction");
        book3 = new Book("The Chimp Paradox", "Prof. Steve Peters", "Psychology");
        book4 = new Book("Simple", "Yotam Ottolenghi", "Cookbook");
        book5 = new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void canAddBooks(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(3, library.getBookCount());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(5, library.getCapacity());
    }

    @Test
    public void checkCapacityNotFull(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        assertEquals(false, library.checkCapacityFull());
    }

    @Test
    public void checkCapacityFull(){
        library.add(book1);
        library.add(book2);
        library.add(book3);
        library.add(book4);
        library.add(book5);

        assertEquals(true, library.checkCapacityFull());
    }

}

//        Books should have title, author and genre.
//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock.
//        Add a capacity to the library and write a method to check if stock is full before adding a book.