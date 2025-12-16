import java.util.Vector;

public class Author {

    private int authorId;
    private String name;

    // An author can have multiple books
    private Vector<Book> myBooks;

    // Constructor
    public Author(int authorId, String name) {
        this.authorId = authorId;
        this.name = name;
        this.myBooks = new Vector<>();
    }

    // Add a book to author
    public void addBook(Book book) {
        if (myBooks.contains(book)) {
            System.out.println("Book already added for this author.");
            return;
        }
        myBooks.add(book);
        System.out.println("Book added to author successfully.");
    }

    // Remove a book from author
    public void removeBook(Book book) {
        if (!myBooks.contains(book)) {
            System.out.println("Book not found for this author.");
            return;
        }
        myBooks.remove(book);
        System.out.println("Book removed from author.");
    }

    // Display author information
    public void getAuthorInfo() {
        System.out.println("Author IDNO: " + authorId);
        System.out.println("Author Name: " + name);
        System.out.println("Books Written: " + myBooks.size());
    }
}
