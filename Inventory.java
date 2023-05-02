import java.util.HashMap;

public class Inventory {
  private HashMap<String, Integer> items;
  public String itemName;

    public Inventory() {
        this.items = new HashMap<String, Integer>();

    }
  
  /**
 * Adds a specified quantity of an item to the inventory.
 *
 * @param itemName  the name of the item to add
 * @param quantity  the quantity of the item to add
 */
  public void addItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            int currentQuantity = items.get(itemName);
            items.put(itemName, currentQuantity + quantity);
        } else {
            items.put(itemName, quantity);
        }
    }

    
  /**
 * Removes a specified quantity of an item from the inventory.
 *
 * @param itemName  the name of the item to remove
 * @param quantity  the quantity of the item to remove
 */
  public void removeItem(String itemName, int quantity) {
        if (items.containsKey(itemName)) {
            int currentQuantity = items.get(itemName);
            if (currentQuantity <= quantity) {
                items.remove(itemName);
            } else {
                items.put(itemName, currentQuantity - quantity);
            }
        }
    }

    // /**
    //  * Gets an item if the inventory contains it
    //  * @param itemName - the name of the item that is being checked for
    //  * @return - name of the item the inventory contains
    //  */
    // public String getItem(String itemName) {
    //     if (items.containsKey(itemName)) {
    //         return items.get(itemName);
    //     }
    //     else {
    //         System.out.println("Sorry, this item is not in your inventory, so we can't get it.");
    //         return null;
    //     }
    // }
    
  /**
 * Checks whether the inventory contains a specified item.
 *
 * @param itemName  the name of the item to check for
 * @return true if the inventory contains the item, false otherwise
 */
  public boolean hasItem(String itemName) {
        return items.containsKey(itemName);
    }

    
  /**
 * Returns the quantity of a specified item in the inventory.
 *
 * @param itemName  the name of the item to get the quantity for
 * @return the quantity of the specified item in the inventory, or 0 if the item is not in the inventory
 */
  public int getItemQuantity(String itemName) {
        if (items.containsKey(itemName)) {
            return items.get(itemName);
        } else {
            return 0;
        }
    } 

}