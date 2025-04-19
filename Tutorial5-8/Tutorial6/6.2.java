import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a book and a member
        Book book1 = new Book("Effective Java", "Joshua Bloch", "9780134685991");
        Member member1 = new Member("Alice", "M001");

        // Transaction object
        Transaction transaction = new Transaction();

        // Borrow and return
        transaction.borrowBook(book1, member1);

        System.out.println();

        transaction.returnBook(book1, member1);
    }
}

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return title + " by " + author + " [ISBN: " + isbn + "]";
    }
}

// Member class
class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed: " + book.getTitle());
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            System.out.println(name + " returned: " + book.getTitle());
        } else {
            System.out.println(name + " did not borrow this book.");
        }
    }
}

// Transaction class
class Transaction {
    public void borrowBook(Book book, Member member) {
        member.borrowBook(book);
    }

    public void returnBook(Book book, Member member) {
        member.returnBook(book);
    }
}