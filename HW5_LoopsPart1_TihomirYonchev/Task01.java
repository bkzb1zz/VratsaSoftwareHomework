import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numbers from the interval 'm' to 'n' with be producted");
		System.out.print("Enter number m: ");
		int m = sc.nextInt();
		
		System.out.print("Enter number n: ");
		int n = sc.nextInt();
		
		int product = 1;

		if (n < m) {
			System.out.println("The interval starts from 'm' to 'n', meaning that 'n' must be bigger than 'm'");
		}
		else {
			for (int i = m; i <= n; i++) {
				product *= i;
			}
			System.out.println(product);
		}
	}
}
