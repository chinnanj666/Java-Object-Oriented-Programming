package ArrayUsers;

import java.util.Scanner;

public class userMain {
    public static void main(String[] args) {
        Users obj1 = new Users(123, "John", "jonh0@gmail.com");
        Users obj2 = new Users(3, "hello", "hello@gmail.com");
        Users obj3 = new Users(6, "joy", "joy@gmail.com");
        Users obj4 = new Users(1, "naa", "naa@gmail.com");
        Users obj5 = new Users(44, "hello", "hello@gmail.com");
        Users obj6 = new Users(621, "joy", "joy@gmail.com");

        Users[] userss = {obj1, obj3, obj2, obj6, obj4, obj5};

        System.out.println("---------Listing all users available-----------------");
        for (Users user : userss) {
            System.out.println(user);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the userId to search:");
        int userIdd = input.nextInt();

        boolean found = false;

        for (Users user : userss) {
            if (userIdd == user.getUserID()) {
                System.out.println("User Found:");
                System.out.println("ID: " + user.getUserID());
                System.out.println("Name: " + user.getUserName());
                System.out.println("Email: " + user.getEmail());
                found = true;
                break; // Stop searching once found
            }
        }

        if (!found) {
            System.out.println("-----------Entry is not found, please try again--------------");
        }

        input.close();
    }
}
