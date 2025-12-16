import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Loan {

    private int loanId;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    public Member myMember;
    public Librarian myLibrarian;

    private boolean isReturned = false;

    // Constructor
    public Loan(int loanId, Date issueDate, Date dueDate, Member member, Librarian librarian) {
        this.loanId = loanId;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.myMember = member;
        this.myLibrarian = librarian;
    }

    // Borrow book
    public void borrowBook() {
        if (issueDate != null) {
            System.out.println("Book already borrowed.");
            return;
        }
        issueDate = new Date();
        System.out.println("Book borrowed successfully.");
    }

    // Return book
    public void returnBook() {
        if (isReturned) {
            System.out.println("Book already returned.");
            return;
        }
        returnDate = new Date();
        isReturned = true;
        System.out.println("Book returned successfully.");
    }

    // Calculate fine
    public double calculateFine() {
        if (!isReturned) {
            return 0.0;
        }

        if (returnDate.after(dueDate)) {
            long diff = returnDate.getTime() - dueDate.getTime();
            long daysLate = TimeUnit.MILLISECONDS.toDays(diff);
            return daysLate * 5.0; // Fine = 5 per day
        }
        return 0.0;
    }
}