import java.util.Random;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Boolean hasGuessed = false;
		int input;
		Random random = new Random();
		int  n = random.nextInt(20) + 1;
		int counter = 1;
		
		while(hasGuessed == false){
			System.out.print("Enter a number between 1 and 20 which you must guess: ");
			input = sc.nextInt();
			
			if (input == n) {
				hasGuessed = true;
				System.out.printf("Congratulations you have guessed the number at your %d attempt.", counter);
			}
			else{
				if (input > n) {
					System.out.println("Too high, try again!");
				}
				else if (input < n) {
					System.out.println("Too low, try again!");
				}
				counter++;
			}
		}
	}
}
