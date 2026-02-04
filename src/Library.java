import java.util.ArrayList;

public class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        books.add(new Book(title, author));
    }
    public void listBooks(){
        if(books.isEmpty()){
            System.out.println("No books in the library.");
            return;
        }
        for (int i=0; i<books.size(); i++) {
            System.out.println((i+1) + ". " + books.get(i));
        }
    }
    public void checkOutBook(int index) {
        if (index<0 || index >= books.size()) {
            System.out.println("Invalid book number.");
            return;
        }
        if (!books.get(index).isAvailable()){
            System.out.println("That books is already checked out.");
            return;
        }
        books.get(index).checkOut();
        System.out.println("Book checked out!");
            }
    public void returnBook(int index) {
        if(index < 0 || index >= books.size()) {
            System.out.println("Invalid book number.");
            return ;
        }
        books.get(index).returnBook();
        System.out.println("Book returned!");
    }
}