import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
  ArrayList<String> Games = new ArrayList<>();

    public Menu() {
    }
    public int GetGames() {
      System.out.println("Select a Game: ");
      System.out.println("1. Assassin's Creed: $69.99");
      System.out.println("2. Blood Rain: $29.57");
      System.out.println("3. Mario Cart: $49.12");
      System.out.println("4. World of Warcraft: 23.99");
      System.out.println("4. Checkout");
      System.out.println("5. Back");
      Scanner scanner = new Scanner(System.in);
      Integer choice = scanner.nextInt();
      return choice;
    }

  public void performAction() {

    int choice;
    Scanner input = new Scanner(System.in);
    do {
      GetGames();
      choice = input.nextInt();


      switch (choice) {
        case 1:
          Main.cartAmount = Main.cartAmount + 69.99;
          break;
        case 2:
          Main.cartAmount = Main.cartAmount + 29.57;
          break;
        case 3:
          Main.cartAmount = Main.cartAmount + 49.12;
          break;

        case 4:
          Main.cartAmount = Main.cartAmount + 23.99;
          break;

        default:
          System.out.println("Going back to Main Menu.");

          break;
      }
    } while (choice != 5);


  }


}
