import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Room {
	private String name;
	private String description;
	private List<Itemlist> itemInRoom = new ArrayList<>();
	private Room north;
	private Room south;
	private Room west;
	private Room east;
	
	
	public Room (String name, String description) {
		this.name = name;
		this.description = description;
		this.itemInRoom = new ArrayList<>();
		
	}
//getters and setters important to change stuff for game purposes
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	

	public List<Itemlist> getItems() {
    return itemInRoom;
	}
	
	public String printInventory(Map<Itemlist, Item> items) {
		String irgend = "you see:\n";
		for(int i = 0; i < itemInRoom.size(); i++) {
			Item itemObj = items.get(itemInRoom.get(i));
			irgend += (i+1) + ". " + itemObj.getName() + "\n";
		}
		return irgend;
	}
	
	
	
	public void setNorth(Room northRoom) {
		this.north = northRoom;
	}
	public Room getNorth() {
		return north;
	}
	
	public void setSouth(Room southRoom) {
		this.south = southRoom;
	}
	public Room getSouth() {
		return south;
	}
	
	public void setWest(Room westRoom) {
		this.west = westRoom;
	}
	public Room getWest() {
		return west;
	}
	
	public void setEast(Room eastRoom) {
		this.east = eastRoom;
	}
	public Room getEast() {
		return east;
	}
}
