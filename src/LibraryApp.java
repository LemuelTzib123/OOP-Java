import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n1. Add book");
            System.out.println("2. View books");
            System.out.println("3. Check out book");
            System.out.println("4. Return book");
            System.out.println("5. Quit");
            System.out.println("6. Remove book");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1 -> {
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    library.addBook(title, author);
                }
                case 2 -> library.listBooks();
                case 3 -> {
                    System.out.print("Book number: ");
                    int num = scanner.nextInt();
                    library.checkOutBook(num-1);
                }
                case 4 -> {
                    System.out.print("Book number: ");
                    int num =scanner.nextInt();
                    library.returnBook(num-1);
                }
                case 5 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
                case 6 -> {
                    System.out.print("Book number to remove: ");
                    int num = scanner.nextInt();
                    library.removeBook(num - 1);
                }
                default -> System.out.println("Invalid option.");
            }

        }
    }
}