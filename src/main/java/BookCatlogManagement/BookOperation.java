package BookCatlogManagement;

import java.util.Scanner;
public class BookOperation {
    static Book[] MyBookShelf = null;

    public static void AddingBooks() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the books:\t");
        int numberOfBooks = input.nextInt();
        MyBookShelf = new Book[numberOfBooks];

        for (int index = 0; index < MyBookShelf.length; index++) {
            System.out.println("Enter the name of the book:\t");
            String Bookname = input.next();
            System.out.println("Enter the author name\t");
            String authorname = input.next();
            Book book = new Book(Bookname, authorname);
            MyBookShelf[index] = book;    // at 0 we are mapping book
        }
    }

    public static void listAllBooks() {
        for (Book books : MyBookShelf) {   //my books are present in mybookshelf
            System.out.println(books);
        }
    }
    public  static  Book IsMybookpresent( String title){
        Book ismybook = null;
        for (Book books:MyBookShelf){
            if (books.getTitle().equals(title)){
                ismybook = books;
            }
        }
        return ismybook;
    }
}


