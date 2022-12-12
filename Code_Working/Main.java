// Miguel Morel
// 800877651
// ITCS 3112-051
// Prof. Daniel Jugan

import java.util.ArrayList;
import java.util.Scanner;

//hello world
public class Main {
  public static Game game = new Game();
  // Keeping track of Money
  public static double cartAmount = 0.0;

  // Creating a menu Object
  Menu myMenu = new Menu();


  public static void displayMenu() {
    System.out.println("Enter a number below with your selection: ");
    System.out.println("1. Add a game to your cart");
    System.out.println("2. Remove a game from your cart");
    System.out.println("3. View your cart");
    System.out.println("4. Checkout");
    System.out.println("5. Quit");
  }
  public static ArrayList<String> Games = new ArrayList<>();

    public static void main(String[] args) {

      Greeter greeter = new Greeter();
      greeter.welcome();
//      greeter.logOut();

      Registration registration = new Registration();
      registration.login();

      performAction();



    }
  public static void performAction() {

    int choice;
    Scanner input = new Scanner(System.in);
    do {
       displayMenu();
       choice = input.nextInt();


      switch (choice) {
        case 1:
          game.addGame();
          break;

        case 2:
          game.removeGame();
          break;

        case 3:
          game.printGames();
          break;

        case 4:
          game.checkout();
          break;

        case 5:
          System.out.println("You have quit the program.");
          System.exit(0);

        default:
          System.out.println("Invalid input. Please enter a valid choice.");

          break;
      }
    } while (choice != 5);


  }
}
