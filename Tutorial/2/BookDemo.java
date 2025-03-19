class Book {
    private int bookID;
    private String title;
    private String author;
    private boolean availabilityStatus;

    public Book(int bookID, String title, String author, boolean availabilityStatus) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = availabilityStatus;
    }

    public void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book(101, "Java Programming", "Herbert Schildt", true);
        book.displayBookDetails();
    }
}