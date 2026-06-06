import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        library.addBook(new Book(101, "Java Programming"));
        library.addBook(new Book(102, "Data Structures"));
        library.addBook(new Book(103, "Operating Systems"));

        int choice;

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    library.viewBooks();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    int issueId = sc.nextInt();
                    library.issueBook(issueId);
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int returnId = sc.nextInt();
                    library.returnBook(returnId);
                    break;

                case 4:
                    System.out.println("Program Closed.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
