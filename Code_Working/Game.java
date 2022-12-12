import java.util.ArrayList;
import java.util.Scanner;

// Assumptions
// 1. One copy of a game is order per title
// 2. Each game cost 60.00
public class Game {

    public Game() {
    }

    // create an array list of 5 games

    // create a function that stores games in an array list
    public void addGame() {
        System.out.println("Select a Game: ");
        System.out.println("1. Assassin's Creed: $69.99");
        System.out.println("2. Blood Rain: $29.57");
        System.out.println("3. Mario Cart: $49.12");
        System.out.println("4. World of Warcraft: 23.99");

        try {
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();
            Main.Games.add(choice);
            switch (Integer.parseInt(choice)) {
                case 1:
                    Main.cartAmount = Main.cartAmount + 69.99;
                    System.out.println("You have added the game to your cart.");
                    break;
                case 2:
                    Main.cartAmount = Main.cartAmount + 29.57;
                    System.out.println("You have added a game to your cart.");
                    break;
                case 3:
                    Main.cartAmount = Main.cartAmount + 49.12;
                    System.out.println("You have added a game to your cart.");
                    break;
                case 4:
                    Main.cartAmount = Main.cartAmount + 23.99;
                    System.out.println("You have added a game to your cart.");
                    break;

                default:
                    System.out.println("Invalid input. Enter a number from 1-4.");
                    addGame();

                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    // create a function that removes games from an array list
    public void removeGame() {
        System.out.println("Select a Game: ");
        System.out.println("1. Assassin's Creed: $69.99");
        System.out.println("2. Blood Rain: $29.57");
        System.out.println("3. Mario Cart: $49.12");
        System.out.println("4. World of Warcraft: 23.99");

        try {
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            Main.Games.add(choice);
            switch (Integer.parseInt(choice)) {
                case 1:
                    Main.cartAmount = Main.cartAmount - 69.99;
                    System.out.println("You have removed a game from your cart.");
                    break;
                case 2:
                    Main.cartAmount = Main.cartAmount - 29.57;
                    System.out.println("You have removed a game from your cart.");
                    break;
                case 3:
                    Main.cartAmount = Main.cartAmount - 49.12;
                    System.out.println("You have removed a game from your cart.");
                    break;
                case 4:
                    Main.cartAmount = Main.cartAmount - 23.99;
                    System.out.println("You have removed a game from your cart.");
                    break;

                default:
                    System.out.println("Invalid input. Please enter a number from 1-4.");
                    removeGame();

                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please try again.");
        }
    }

    // create a function that prints games in an array list
    public void printGames() {
        if (Main.Games.size() == 0) {
            System.out.println("There are currently no games in your library.");
        } else {
            System.out.println("Games in your library: ");
            for (int i = 0; i < Main.Games.size(); i++) {
                System.out.println(Main.Games.get(i));
            }

        }

    }

    public void checkout() {

        // Calculating the total 60 * (Size of arrayList +1 cause it starts)
        double total = Main.cartAmount;

        System.out.println("Your Total is " + String.valueOf(total));



        if (total <= 0) {
            System.out.println("You don't have a balance due at this time. Please add some games to your cart to proceed with checkout");
        } else {
            System.out.println("How would you like to pay? Enter 1 for cash or 2 for card: ");

            Scanner input = new Scanner(System.in);
            int tender = input.nextInt();

            if (tender == 1) {
                System.out.println("You have successfully paid " + total
                        + " in cash. Thank you for shopping with us and enjoy your game!");
            } else if (tender == 2){
                System.out.println("You have successfully paid " + total
                        + " with your card. Thank you for shopping with us and enjoy your game!");
            } else {
                System.out.println("Invalid input. Please enter a valid input.");
            }
        }

    }
}
