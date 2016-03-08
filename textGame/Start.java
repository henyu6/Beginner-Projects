import java.util.Scanner;


public class Start {
	public static void main(String[] args) {
		Room bathroom = new Bathroom();
		Room diningRoom = new Diningroom();
		Room kitchen = new Kitchen();
		Room garage = new Garage();
		Room livingRoom = new Livingroom();
		Room bedroom = new Bedroom();
		
		livingRoom.setOtherRooms(bathroom, garage);
		garage.setOtherRooms(livingRoom, diningRoom);
		diningRoom.setOtherRooms(garage, kitchen);
		kitchen.setOtherRooms(diningRoom, bedroom);
		bedroom.setOtherRooms(kitchen, bathroom);
		bathroom.setOtherRooms(bedroom, livingRoom);
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is your name?");
		String input = in.nextLine();
		Player p1 = new Player(input, kitchen);
		System.out.println("Hello " + input);
		
		System.out.println("You are currently trying to rob this house.");
		System.out.println("Your starting room is: " + p1.getRoom());
		System.out.print("You can enter the " + p1.getNextRoom() + " or ");
		System.out.println(p1.getOldRoom());
		System.out.print("Possible commands are forward, back, search, ");
		System.out.println("pickup [item], search [item], currBag, quit");
		
		while(true) {
			input = in.next();
			if(input.equalsIgnoreCase("quit")) {
				in.close();
				System.out.println("Thank you for playing!");
				return;
			}
			else if(input.equalsIgnoreCase("forward")) {
				p1.forward();
			}
			else if(input.equalsIgnoreCase("back")) {
				p1.back();
			}
			else if(input.equalsIgnoreCase("search")) {
				input = in.nextLine();
				p1.searchItem(input);
			}
			else if(input.equalsIgnoreCase("pickup")) {
				input = in.nextLine();
				p1.pickup(input);
			}
		}
		
	}
}
