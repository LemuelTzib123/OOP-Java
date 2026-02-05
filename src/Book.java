public class Book {
    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public void checkOut() {
        available = false;
    }

    public boolean isAvailable() {
        return available;
    }
    public void returnBook() {
        available = true;
    }

    public String toString() {
        if (available){
            return title + " by " +author+ " (Available)";
        }
        else {
            return title + " by " + author + "(Checked out)";
        }
    }
}