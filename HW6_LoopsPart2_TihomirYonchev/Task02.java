import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number 'n' to print a matrix: ");
		int n = sc.nextInt();

		if (n < 20) {
			for (int i = 0; i < n; i++) {
				for (int j = 1; j <= n; j++) {
					System.out.printf("%1$-3d", (i + j));
				}
				System.out.println();
			}
		}
	}
}
