package calculation;
import java.util.Scanner;

public class calculation {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in); //Initializing scanner
		int x;
		x = keyboard.nextInt();
		
		int chapter = x%4 + 2; //calculates chapter #
		int question = 0;
		
		if (chapter == 2) {// determines which exercise # depending on the chapter #
			question = chapter%26 +1;
		} else if (chapter == 3) {
			question = chapter%34 +1;
		} else if (chapter == 4) {
			question = chapter%46 +1;
		} else if (chapter == 5) {
			question = chapter%38 +1;
		}
		System.out.println("Your chapter number is " + chapter); // prints the answers
		System.out.println("Your exercise number is " + question);
	}
}
