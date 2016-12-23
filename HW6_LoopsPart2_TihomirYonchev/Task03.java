import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number 'n' to print a rhombus: ");
		int n = sc.nextInt();
		
		for (int i = n; i > 0; i--) {
			for (int j = i; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("/");
			}
			for (int j = i; j <= n; j++) {
				System.out.print("\\");
			}
			System.out.println();
		}
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j >= 0; j--) {
				System.out.print(" ");
			}
			for (int j = i; j < n; j++) {
				System.out.print("\\");
			}
			for (int j = i; j < n; j++) {
				System.out.print("/");
			}
			System.out.println();
		}

	}

}
