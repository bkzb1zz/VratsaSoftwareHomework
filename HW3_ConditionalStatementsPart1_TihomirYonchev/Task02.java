import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hour between 0 and 23: ");
		int hour = sc.nextInt();

		System.out.print("Enter is the parrot talking (type true or false): ");
		Boolean isTalking = sc.nextBoolean();
		
		if (hour >= 0 && hour <= 23) {
			if ((hour < 7 && isTalking == true) || (hour > 20 && isTalking == true)) {
				System.out.println("We are in trouble, hide yo' kids");
			}
			else{
				System.out.println("We are not in trouble");
			}
		}
		else{
			System.out.println("Wrong input, try again");
		}
	}
}
