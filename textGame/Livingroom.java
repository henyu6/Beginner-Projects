
public class Livingroom extends Room{
	
	public Livingroom() {
		super("Living Room");
		String[] items = {"Sofa", "Keys", "Table", "Television"};
		super.setItems(items);
	}
	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Sofa")) {
			System.out.println("You find $100 in the sofa");
			return 100;
		}
		else if(item.equalsIgnoreCase("keys")) {
			System.out.println("Maybe this can open the door to the car");
			return -17;
		}
		else if(item.equalsIgnoreCase("Table")) {
			System.out.println("Tables everywhere! Nothing to be found");
			return 0;
		}
		else if(item.equalsIgnoreCase("Television")) {
			System.out.println("Nothing but static");
			return 0;
		}
		return 0;
	}
}
