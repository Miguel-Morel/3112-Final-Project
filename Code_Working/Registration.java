import java.util.Scanner;

public class Registration {

    public Registration() {
    }

    // if user is not registered, ask for username. otherwise, log the user in
    public void login() {
        System.out.println("Are you a registered user? (y/n)");
        try {
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            if (answer.equals("y")) {
                System.out.println("Enter your username: ");
                String username = input.nextLine();
                System.out.println("Welcome back, " + username + "!");
            } else {
                System.out.println("Enter your username: ");
                String username = input.nextLine();
                System.out.println("Welcome to your Steam Library, " + username + " !");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
            login();
        }
    }
}
