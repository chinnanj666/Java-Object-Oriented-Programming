package BookCatlogManagement;

import java.util.Scanner;

public class BookMain {
        public static void main(String[] args) {
                System.out.println(BookConstant.LibraryMenu);
                System.out.println();
                BookOperation.AddingBooks();
                Scanner  input = new Scanner(System.in);
                String choice = input.next();


        }
}
