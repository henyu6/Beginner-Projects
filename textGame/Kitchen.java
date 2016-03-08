
public class Kitchen extends Room {
	public Kitchen() {
		super("Kitchen");
		String[] items = {"Knife", "Oven", "Fridge", "Pots and Pans", "Note"};
		super.setItems(items);
	}
	@Override
	public int search(String item) {
		if(item.equalsIgnoreCase("Knife")) {
			System.out.println("Wonder what this knife can be used for.");
			return -15;
		}
		else if(item.equalsIgnoreCase("Oven")) {
			System.out.println("Whoa! $50 in the oven?");
			return 20;
		}
		else if(item.equalsIgnoreCase("Fridge")) {
			System.out.println("Ew rotting cheese...");
			return 0;
		}
		else if(item.equalsIgnoreCase("pots and pans")) {
			System.out.println("You didn't find anything inside the pots and pans");
			return 0;
		}
		else if(item.equalsIgnoreCase("note")) {
			System.out.println("The note reads 10-23-19");
			return -16;
		}
		return 0;
	}
}
