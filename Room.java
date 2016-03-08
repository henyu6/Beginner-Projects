
public class Room {
	private Room nextRoom;
	private Room backRoom;
	private String currRoom;
	private String items[];
	
	public Room(String room) {
		currRoom = room;
	}
	
	//returns what the old room's name was
	public Room getOldRoom() {
		return backRoom;
	}
	
	//returns what the new room will be
	public Room getNextRoom() {
		return nextRoom;
	}
	
	public String toString() {
		return currRoom;
	}
	
	//returns what the currentRoom
	public String getCurrRoom() {
		return currRoom;
	}
	
	//returns the items that are found in the room
	public String[] getItems() {
		return items;
	}
	
	//sets the items that can be found in the room
	public void setItems(String items[]) {
		this.items = items;
	}
	
	public void setOtherRooms(Room prevRoom, Room forwardRoom) {
		backRoom = prevRoom;
		nextRoom = forwardRoom;
	}
	
	public int search(String item) {
		return 0;
	}
}
