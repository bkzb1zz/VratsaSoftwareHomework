import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int input = sc.nextInt();

		if (input % 3 == 0 && input % 5 == 0){
			System.out.println("It is divisible by 3 and 5");
		}
		else if (input % 3 == 0) {
			System.out.println("It is divisible only by 3");
		}
		else if (input % 5 == 0) {
			System.out.println("It is divisible only by 5");
		}
		else{
			System.out.println("It isn't divisible by 3 and 5");
		}
	}
}
