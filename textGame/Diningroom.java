
public class Diningroom extends Room{

	public Diningroom() {
		super("Dining Room");
		String[] items = {"Plates", "Candles", "Table", "Chairs"};
		super.setItems(items);
	}
	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Plates")) {
			System.out.println("Maybe this can be sold for $20");
			return 20;
		}
		else if(item.equalsIgnoreCase("Candles")) {
			System.out.println("Cool candles!");
			return 0;
		}
		else if(item.equalsIgnoreCase("Table")) {
			System.out.println("Wow! A table! You see $10");
			return 10;
		}
		else if(item.equalsIgnoreCase("CHAIRS")) {
			System.out.println("You didn't find anything");
			return 0;
		}
		return 0;
	}
}
