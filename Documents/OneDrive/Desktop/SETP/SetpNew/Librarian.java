import java.util.ArrayList;

public class Librarian {
    private String name;
    private ArrayList<Book> books;

    public Librarian(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    // Search books by title
    public ArrayList<Book> searchBookByTitle(String title) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    // Search books by author name
    public ArrayList<Book> searchBookByAuthor(String authorName) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books) {
            for (Author author : book.getAuthors()) {
                if (author.getName().toLowerCase().contains(authorName.toLowerCase())) {
                    results.add(book);
                    break; // Move to next book once a match is found
                }
            }
        }
        return results;
    }

    // Getters
    public ArrayList<Book> getBooks() {
        return books;
    }
}
