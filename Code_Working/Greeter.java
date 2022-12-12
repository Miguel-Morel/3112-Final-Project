import java.util.Scanner;

public class Greeter {

    // create a function that welcomes the user to Steam Game Manager
    public void welcome() {
        System.out.println("Welcome to the Stream Game Manager!");
    }

    // create a function that asks the user for their name and stores it
    public String askName() {
        System.out.println("What is your name?");
        try {
           Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            return name;
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            return askName();
        }
    }

    // create a function that displays log out message
    public void logOut() {
        System.out.println("You have been logged out.");
    }
}
