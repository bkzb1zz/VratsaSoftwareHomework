import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Is monkey 'a' smiling (write true or false): ");
		Boolean aSmile = sc.nextBoolean();
		
		System.out.print("Is monkey 'b' smiling (write true or false): ");
		Boolean bSmile = sc.nextBoolean();
		
		if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
			System.out.println("We are in trouble");
		}
		else {
			System.out.println("We are not in trouble");
		}
	}
}
