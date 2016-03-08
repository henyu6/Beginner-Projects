
public class Player {

	private String name;
	private Room currRoom;
	private int maxItems = 10;
	private int currInventory = 0;
	private int money = 0;
	private String myItem[] = new String[maxItems];
	
	
	public Player(String n, Room startRoom) {
		this.name = n;
		currRoom = startRoom;
	}
	
	public String getRoom() {
		return currRoom.getCurrRoom();
	}
	
	public String getNextRoom() {
		return currRoom.getNextRoom().toString();
	}
	
	public String getOldRoom() {
		return currRoom.getOldRoom().toString();
	}
	
	public void forward() {
		currRoom = currRoom.getNextRoom();
		System.out.println("Current Room: " + currRoom.getCurrRoom());
		System.out.println("Next room: " + currRoom.getNextRoom());
		System.out.println("Back room: " + currRoom.getOldRoom());
	}

	public void back() {
		currRoom = currRoom.getOldRoom();
		System.out.println("Current Room: " + currRoom.getCurrRoom());
		System.out.println("Next room: " + currRoom.getNextRoom());
		System.out.println("Back room: " + currRoom.getOldRoom());
	}
	
	public void pickup(String item) {
		String[] items = currRoom.getItems();
		
		for(int i = 0; i < items.length; i++) {
			if(item.charAt(0) == ' ') {
				item = item.substring(1,item.length());
			}
			if(items[i].equalsIgnoreCase(item)) {
				myItem[currInventory++] = item;
				System.out.println(item + " was picked up.");
				return;
			}
		}
		System.out.println("Could not find " + item);
	}
	
	public void currBag() {
		System.out.println("Your current bag contains: ");
		for(int i = 0; i < myItem.length; i++) {
			System.out.println(myItem[i]);
		}
	}
	public void search() {
		String[] items = currRoom.getItems();
		for(int i = 0; i < items.length; i++) {
			System.out.println(items[i]);
		}
	}
	public void searchItem(String item) {
		if(item.charAt(0) == ' ') {
			int retVal = currRoom.search(item);
			detItem(retVal);
		}
		else 
			search();
	}
	public void detItem(int returned) {
		if(returned > 0) {
			money += returned;
		}
		else if(returned == -12) {
			myItem[currInventory] = "Wrench";
		}
	}
}
