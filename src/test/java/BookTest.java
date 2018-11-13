import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book1, book2, book3, book4, book5;

    @Before
    public void before(){
        book1 = new Book("Becoming", "Michelle Obama", "Autobiography");
        book2 = new Book("This is going to hurt", "Adam Kay", "Non-Fiction");
        book3 = new Book("The Chimp Paradox", "Prof. Steve Peters", "Psychology");
        book4 = new Book("Simple", "Yotam Ottolenghi", "Cookbook");
        book5 = new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction");
    }

    @Test
    public void hasTitle(){
        assertEquals("Becoming", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Prof. Steve Peters", book3.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Cookbook", book4.getGenre());
    }

}