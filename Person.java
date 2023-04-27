import java.util.Scanner;
import java.util.ArrayList;

public class Person {

  private String name;
  private String pronouns;
  public ArrayList<String> inventory; 
  public int points = 0; // total points

  public Person(String name, String pronouns) {
    this.name = name;
    this.pronouns = pronouns; 
    this.inventory = new ArrayList<String>();
  }

  public int changePoints(String choice) {
    Scanner choice = new Scanner(System.in);

    for (int choiceMade = 0; choiceMade > 0; choiceMade++) {
  
    if (choiceMade == 1) {
      points += 5;
    }
    else if (choiceMade == 2) {
      points += 0;
    }
    else if (choiceMade == 3) {
      points += 2.5;
    }
    else if (choiceMade == 4) {
      points += 5; 
    }

  }
  
    // call on LoveInterest class
    // only increases points if Traveler chooses a response with greater than 0 points, receive index from ArrayList and then number of points (value associated with this key) and add these points to the total points
    
  }
  // have a method for the loveinterest in each scene : if else statement within each method for the scene
  // if points is ___
  // return this ending
  
  /**
  */
  public void getPersonInfo() {
    //returns traveler current information including name, pronouns, size of inventory.
    System.out.println("Your name is " + this.name + ".");
    System.out.println("Your pronouns are " + this.pronouns + ".");
    System.out.println("You currently have " + this.inventory.size() + " items in your inventory.");
  }

  public int getPoints() {
    // returns total number of points that user has currently
    return points;
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
    Person traveler = new Person("Traveler", "He/Him");
    traveler.getPersonInfo();
  }

  
}