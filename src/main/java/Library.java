import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new ArrayList<Book>();
    }

    public int getBookCount() {
        return this.books.size();
    }

    public void add(Book book3) {
        if (getBookCount() < this.capacity) {
            this.books.add(book3);
        }

    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean checkCapacityFull() {
        if (getBookCount() >= getCapacity())
            return true;
        else
            return false;
    }
    
}