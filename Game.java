import java.util.Scanner;

public class Game {

    private Scanner scanner = new Scanner(System.in);

    public void pressReturn(){
        System.out.println("Press `return` to continue...");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
        }
    }
    public void throwAwayitem() {
        System.out.println("Press x to throw away an item in your inventory.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("x")) {
                System.out.println("Which item would you like to throw away? You currently have " + Inventory.() + " in your inventory.");
                Inventory.removeItem(itemName);
                break;
            }

        }
    }
    

}