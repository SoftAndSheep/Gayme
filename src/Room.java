import java.util.ArrayList;
import java.util.List;

public class Room {
	private String name;
	private String description;
	private List<Item> item;
	private Room north;
	private Room south;
	private Room west;
	private Room east;
	
	
	public Room (String name, String description) {
		this.name = name;
		this.description = description;
		this.item = new ArrayList<>();
		
	}
//getters and setters important to change stuff for game purposes
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	

	public boolean hasItem(String itemName) {
		return false;
		
    
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
