import java.util.ArrayList;
import java.util.List;

public class Player {
	private Room currentRoom;
	List<Itemlist> inventory = new ArrayList<>(); 
	
	
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

public List<Itemlist> getInventory() {
    return inventory;
}

	
}
