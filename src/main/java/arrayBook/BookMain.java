package arrayBook;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book obj = new Book(1, "Python", "dr.joy", 599.0);
        Book obj1 = new Book(1, "The Beast Java", "dr.dc", 999.0);
        Book obj2 = new Book(1, "c-programming", "dr.qwen", 499.0);
        Book obj3 = new Book(1, "Golang", "dr.roy", 699.0);
        Book[] myBookList = {obj, obj1, obj3, obj2};
        Scanner input = new Scanner(System.in);
        System.out.println("-------------List Of the Books for Available-----------");
        for (Book mybooks : myBookList) {
            System.out.println(mybooks);
        }
        int totalPrice = 0;
        for (Book i : myBookList) {
            totalPrice += i.getPrice();
        }
        System.out.println(totalPrice);

        for (Book j : myBookList){
            System.out.println("Enter the book title");
            String mytitle = input.nextLine();
            if (j.getTitle().equals(mytitle))
            {
                System.out.println("The author Name:\t" + j.getAuthor()  + "\n" +" The Book Id :\t"  + j.getBookId()  + "\n"  + " The Book price is:\t" + j.getPrice() + "\n" + "The Title you search is:\t" + j.getTitle() );
            }
            else {
                System.out.println("----------------The Enter book is Not Found---------");
            }
        }
    }
}

