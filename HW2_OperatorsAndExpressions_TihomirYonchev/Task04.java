import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		
		if (a > 0 && b > 0 && c > 0) {
			if (a < b + c && b < a + c && c < a + b) {
				System.out.println("Triangle exists");
			}
			else{
				System.out.println("Triangle with these parameters doesn't exist");
			}
		}
		else{
			System.out.println("Triangle with these parameters doesn't exist");
		}
	}
}
