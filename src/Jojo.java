import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Jojo{


	private Player player;
	private Map<String, Room> rooms;
	private Map<Itemlist, Item> items;
	// still gotta find out how Maps exactly work

	public Jojo() {
		rooms = new HashMap<>();
		player = new Player(null);
		items = new HashMap<>();
		initializeRooms();

	}

	public void play() {
		TextGameUI UI = new TextGameUI();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to my first Text Adventure");

		while (true) {
			// Displays current Room description
			System.out.println(player.getCurrentRoom().getDescription());
			System.out.println("Enter a Command!");
			String input = scanner.nextLine().toLowerCase(); // convert input to Lowercase

			if (input.equals("exit")) {
				System.out.println("Goodbye!");
				break;
				
			}else if (UI.getInputText().equals("w"))	{
				
			 System.out.println("yaay it works");
			 UI.getTextArea().append("yay it works");
				
				
			} else if (input.startsWith("go ")) {
				String direction = input.substring(3);
				move(direction);
			} else if (input.startsWith("yeet ")) {
				int itemNumb = Integer.valueOf(input.substring(5));
				itemNumb--;
				if (itemNumb >= 0 && itemNumb < player.getInventory().size()) {
					Itemlist itemName = player.getInventory().get(itemNumb);
					if (items.get(itemName).yeet()) {
						player.getInventory().remove(itemName);
					} else {
						System.out.println("you have nothing to be yeeted");
					}
				}
			} else if (input.equals("look around")) {
				System.out.println(player.getCurrentRoom().printInventory(items));
				UI.getTextArea().append(player.getCurrentRoom().printInventory(items));
			
			} else if (input.startsWith("take ")) {
				int itemNumb = Integer.valueOf(input.substring(5));
				Room currentRoom = player.getCurrentRoom();
				itemNumb--;
				if (itemNumb >= 0 && itemNumb < player.getInventory().size()) {
					Itemlist itemName = currentRoom.getItems().get(itemNumb);
					currentRoom.getItems().remove(itemName);
					player.getInventory().add(itemName);
				}
			} else if (input.equals("inventory")) {
				System.out.println(player.printInventory(items));
				UI.getTextArea().append(player.printInventory(items));

			} else {
				System.out.println("I dont understand that command");
			}
		}
	}

	public static void main(String[] Args) {
		Jojo game = new Jojo();
		game.play();
	}

	public void move(String direction) {
		Room currentRoom = player.getCurrentRoom();

		Room nextRoom = null;

		if (direction.equals("north") && currentRoom.getNorth() != null) {
			nextRoom = currentRoom.getNorth();
		} else if (direction.equals("south") && currentRoom.getSouth() != null) {
			nextRoom = currentRoom.getSouth();
		} else if (direction.equals("west") && currentRoom.getWest() != null) {
			nextRoom = currentRoom.getWest();
		} else if (direction.equals("east") && currentRoom.getEast() != null) {
			nextRoom = currentRoom.getEast();
		}

		if (nextRoom != null) {
			// Move the player to the next room
			player.setCurrentRoom(nextRoom);
			System.out.println("You go " + direction + ".");
		} else {
			System.out.println("You can't go that way.");
		}

	}
	

	private void initializeRooms() {
		// setting up the rooms with name and des.
		Room room1 = new Room("Bedroom", "You are in someones Bedroom");
		Room room2 = new Room("Main Room", "This seems to be the Main Hall...");
		Room room3 = new Room("Kitchen", "Looks like the Kitchen");
		Room room4 = new Room("Bedroom2", "This appears to be another Bedroom. I wonder who it belongs to");
		Room room5 = new Room("Library", "A Library... There is an ominous Aura comming from the Room to the West");
		Room room6 = new Room("Villain", "...");
	
		room1.setNorth(room2);
		room2.setSouth(room1);
		room2.setNorth(room5);
		room2.setEast(room3);
		room2.setWest(room4);
		room3.setWest(room2);
		room5.setWest(room6);
		room5.setSouth(room2);
		room6.setEast(room5);
	
		rooms.put("Bedroom", room1);
		rooms.put("MainRoom", room2);
		rooms.put("Kitchen", room3);
		rooms.put("Bedroom2", room4);
		rooms.put("Library", room5);
		rooms.put("Villain", room6);
		// puts the room in the HashMap?
	
		Book Book1 = new Book("BookOfPart1", "A Book about some guy Fighting a Vampire", true);
		Book book2 = new Book("BookOfPart2", "A Book about some guy Fighting a Car");
		items.put(Itemlist.BookOfPart1, Book1);
		items.put(Itemlist.BookOfPart2, book2);
		player.setCurrentRoom(room1);
		player.getInventory().add(Itemlist.BookOfPart1);
	
		room1.getItems().add(Itemlist.BookOfPart2);
	}

}
