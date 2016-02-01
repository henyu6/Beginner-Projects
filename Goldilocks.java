import java.util.InputMismatchException;
import java.util.Scanner;


public class Goldilocks {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean invalid = true;
		int temp = 0;

		while(invalid) {
			try {
				System.out.println("Please enter how hot the porridge is in Fahrenheit:");
				temp = scan.nextInt();
				invalid = false;
			}
			catch (InputMismatchException ex){
				System.out.println("Please enter a valid number!");
				scan.next();
			}
		}
		
		if(temp < 50) 
			System.out.println("The porridge is too cold!!");
		else if(temp > 80) 
			System.out.println("The porridge is too hot!");
		else 
			System.out.println("The porridge is just right.");
		
		if(scan != null) {
			scan.close();
		}
	}
}
