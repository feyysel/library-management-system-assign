import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Loan {

    private int loanId;
    private Date issueDate;
    private Date dueDate;
    private Date returnDate;

    private Member myMember;
    private Librarian myLibrarian;

    private boolean isReturned = true;

    // Constructor
    public Loan(int loanId, Date dueDate, Member member, Librarian librarian) {
        this.loanId = loanId;
        this.dueDate = dueDate;
        this.myMember = member;
        this.myLibrarian = librarian;
    }

    // Borrow book
    public void borrowBook() {
        if (!isReturned) {
            System.out.println("Book already borrowed.");
            return;
        }
        issueDate = new Date();
        isReturned = false;
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
        Date effectiveDate = isReturned ? returnDate : new Date();

        if (effectiveDate.after(dueDate)) {
            long diff = effectiveDate.getTime() - dueDate.getTime();
            long daysLate = TimeUnit.MILLISECONDS.toDays(diff);
            return daysLate * 5.0; // fine per day
        }
        return 0.0;
    }
}
