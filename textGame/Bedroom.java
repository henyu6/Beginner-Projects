
public class Bedroom extends Room{

	public Bedroom() {
		super("Bedroom");
		String[] items = {"Bed", "Closet", "Cabinet", "Pillow", "Safe"};
		super.setItems(items);
	}

	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Bed")) {
			System.out.println("YOU FOUND $20");
			return 20;
		}
		else if(item.equalsIgnoreCase("Closet")) {
			System.out.println("YOU FOUND $40");
			return 40;
		}
		else if(item.equalsIgnoreCase("Cabinet")) {
			System.out.println("YOU FOUND NOTHING");
			return 0;
		}
		else if(item.equalsIgnoreCase("safe")) {
			System.out.println("The Safe is locked! Find a way to open it");
			return -11;
		}
		else 
			System.out.println("COULD NOT FIND ITEM");
		return 0;
	}
}
