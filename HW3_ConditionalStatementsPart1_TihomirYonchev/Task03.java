import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number 'n': ");
		int n = sc.nextInt();
		
		int x = Math.abs(n - 21);
		
		if (x < 21) {
			System.out.print(x);
		}
		else {
			System.out.println(x * 2);
		}
	}
}
