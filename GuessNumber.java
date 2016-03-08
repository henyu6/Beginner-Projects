import java.util.*;


public class GuessNumber {
	public static void main(String[] args) {
		Random ranNum = new Random();
		Scanner scan = new Scanner(System.in);
		int  max = 100, guess = 0;
		int number = ranNum.nextInt(max);
		boolean isInt = false;
		
		while(true) {
			System.out.println("Enter your guess: ");
			while(!isInt) {
			  try {
			    guess = scan.nextInt();
			    isInt = true;
			  }
			  catch(InputMismatchException e) {
				  System.err.println("ERROR: Please enter a number!");
				  scan.next();
			  }
			}
			if(guess < number) {
				System.out.println("Your guess is too low");
				isInt = false;
			}
			else if(guess > number) {
				System.out.println("Your guess is too high");
				isInt = false;
			}
			else {
				System.out.println("YOU GUESSED CORRECTLY!!");
				System.out.println("CONGRATS!!");
				break;
			}
		}
	}

}
