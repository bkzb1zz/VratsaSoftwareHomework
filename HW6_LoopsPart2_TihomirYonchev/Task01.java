import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number 'n' to print a triangle with '*': ");
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
