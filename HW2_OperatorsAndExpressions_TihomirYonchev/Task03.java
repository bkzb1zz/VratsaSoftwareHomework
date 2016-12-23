import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int input = sc.nextInt();
		
		int x = Math.abs(input);
		
		System.out.println(x);
	}
}
