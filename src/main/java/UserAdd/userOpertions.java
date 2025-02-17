package UserAdd;

import java.util.Scanner;

public class userOpertions {
    public void display() {
        Scanner input = new Scanner(System.in);

        // Prompt user for the number of users to add
        System.out.println("Enter the number of users you want to add:");
        int userCount = input.nextInt();
        input.nextLine(); // Consume the leftover newline character

        // Create an array to store User objects
        User[] mylist = new User[userCount];

        // Loop to take input for each user
        for (int i = 0; i < userCount; i++) {
            System.out.println("Enter the name of user " + (i + 1) + ":");
            String name = input.nextLine();

            // Create a new User object and store it in the array
            mylist[i] = new User(name);
        }
        System.out.println("Users added successfully:");  // Display all the users added
        for (User user : mylist) {
            System.out.println(user.getName());
        }
    }
}
