
public class Garage extends Room {

	public Garage() {
		super("Garage");
		String[] items = {"Car", "Wrench", "Hammer"};
		super.setItems(items);
	}
	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Wrench")) {
			System.out.println("You picked up a wrench");
			return -12;
		}
		else if(item.equalsIgnoreCase("Hammer")) {
			System.out.println("You picked up the hammer");
			return -13;
		}
		else if(item.equalsIgnoreCase("Car")) {
			return -14;
		}
		else
			System.out.println("COULD NOT FIND THE ITEM");
		return 0;
	}
}
