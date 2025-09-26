package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("Java Basics", "James Gosling"));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        // Adding users
        library.addUser(new User("Alice", 101));
        library.addUser(new User("Bob", 102));

        // Display books
        library.showBooks();

        // Issue book
        library.issueBook("Java Basics", 101);

        // Try to issue again
        library.issueBook("Java Basics", 102);

        // Return book
        library.returnBook("Java Basics");

        // Show final list
        library.showBooks();
    }
}
