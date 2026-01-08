import java.util.Vector;

public class Book {

    private int bookId;
    private String title;
    private String isbn;
    private String status;

    public Vector<Author> myAuthor;

    public Vector<Member> myMember;

    // Constructor
    public Book(int bookId, String title, String isbn) {
        this.bookId = bookId;
        this.title = title;
        this.isbn = isbn;
        this.status = "Available";
        this.myAuthor = new Vector<>();
        this.myMember = new Vector<>();
    }

    // Add an author
    public void addAuthor(Author author) {
        myAuthor.add(author);
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getStatus() {
        return status;
    }

    public Vector<Author> getAuthors() {
        return myAuthor;
    }

    public Vector<Member> getMembers() {
        return myMember;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display book details
    public void getDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("ISBN: " + isbn);
        System.out.println("Status: " + status);
        System.out.print("Authors: ");
        for (Author a : myAuthor) {
            System.out.print(a.getName() + " ");
        }
        System.out.println();
    }

    // Update status (e.g., when borrowed/returned)
    public void updateStatus(String status) {
        this.status = status;
    }
}
