
public class Bathroom extends Room {
	public Bathroom() {
		super("Bathroom");
		String[] items = {"Toilet", "Toilet Water", "Mirror"};
		super.setItems(items);
	}
	
	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Toilet")) {
			System.out.println("There is nothing in the toilet");
		}
		
		return 0;
	}
}
