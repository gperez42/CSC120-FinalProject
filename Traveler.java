import java.util.ArrayList;

public class Traveler {

  private String name;
  private String pronouns;
  public ArrayList<String> inventory; 
  public int totalPoints; // total points

  public Traveler(String name, String pronouns) {
    this.name = name;
    this.pronouns = pronouns; 
    this.inventory = new ArrayList<String>();
  }
  
  public void getTravelerInfo() {
    //returns traveler current information including name, pronouns, size of inventory.
    System.out.println("Your name is" + this.name);
    System.out.println("Your pronouns are" + this.pronouns);
    System.out.println("You currently have" + this.inventory.size() + " items in your inventory.");
  }

  public int getPoints() {
    // returns total number of points that user has currently
    return totalPoints;
  }

  public void getInventory() {
      // for (String item : this.inventory.(i)) {
      //   System.out.println() 
      // }
      for (int i = 0; i < this.inventory.size(); i++) {
        System.out.println("You currently have " + this.inventory.size() + " items in your inventory.");
        System.out.println("These items are " + this.inventory.get(i));
     }
    
  } 

  public static void main(String[] args) {
    Traveler test = new Traveler("Test", "He/Him");
    test.getTravelerInfo();
  }

  
}