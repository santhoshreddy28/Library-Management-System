import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void issueBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Book Issued Successfully.");
                } else {
                    System.out.println("Book Already Issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }

    public void returnBook(int bookId) {

        for (Book book : books) {

            if (book.getBookId() == bookId) {

                if (book.isIssued()) {
                    book.setIssued(false);
                    System.out.println("Book Returned Successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }

        System.out.println("Book Not Found.");
    }
}
