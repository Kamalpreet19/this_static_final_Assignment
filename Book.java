/*Create a Book class to manage library books with the following features:
Static:
○       A static variable libraryName shared across all books.
○       A static method displayLibraryName() to print the library name.
This:
○       Use this to initialize title, author, and isbn in the constructor.
Final:
○       Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
○       Verify if an object is an instance of the Book class before displaying its details.
 */

public class Book {
    static String libraryName = "Chitkara Library";
    String title;
    String author;
    final String isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Name of the library : " + libraryName + "\nTitle of the book : " + title
                    + "\nAuthor of the book : " + author + "\nISBN number of the book : " + isbn);

        }
    }

    static void displayLibraryName(){
        System.out.println("Name of the library : " + libraryName);
    }
    
    public static void main(String args[]) {
        Book obj=new Book("Harbour English","Farida Naiza","11");
        Book obj1=new Book("Learn Biology","Goyal Brothers","12");
        obj.displayBookDetails();
        obj1.displayBookDetails();
        Book.displayLibraryName();

    }

}
