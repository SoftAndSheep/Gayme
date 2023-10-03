import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {
	private Room currentRoom;
	private List<Itemlist> inventory = new ArrayList<>(); 
	
	
public Player(Room starterRoom) {
	currentRoom = starterRoom;
	//array for the inventory
}


public Room getCurrentRoom() {
	return currentRoom;
}

public void setCurrentRoom(Room newRoom) {
	currentRoom = newRoom;
}

public void takeItem(String itemName) {
	
}

public void dropItem() {
	
}
	
public String printInventory(Map<Itemlist, Item> items) {
	String irgend = "your Zeugs:\n";
	for(int i = 0; i < inventory.size(); i++) {
		Item itemObj = items.get(inventory.get(i));
		irgend += (i+1) + ". " + itemObj.getName() + "\n";
	}
	return irgend;
}

public List<Itemlist> getInventory() {
    return inventory;
}

	
}
