import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 'a': ");
		double a = sc.nextDouble();
		
		System.out.print("Enter number 'b': ");
		double b = sc.nextDouble();
		
		System.out.println("Here are your options!");
		System.out.println("1: а + b");
		System.out.println("2: a – b");
		System.out.println("3: b – 1");
		System.out.println("4: a * b");
		System.out.println("5: a / b");
		System.out.println("6: b / a");
		System.out.print("Enter an option: ");
		int x = sc.nextInt();
		
		String result = "Result of your option N:";
		
		if (x <= 0 || x >= 7) {
			System.out.println("Invalid choice, try again");
		}
		else{
			switch (x) {
			case 1: System.out.printf("%s%d is %f", result, x, (a + b));break;
			case 2: System.out.printf("%s%d is %f", result, x, (a - b));break;
			case 3: System.out.printf("%s%d is %f", result, x, (b - 1));break;
			case 4: System.out.printf("%s%d is %f", result, x, (a * b));break;
			case 5: System.out.printf("%s%d is %f", result, x, (a / b));break;
			case 6: System.out.printf("%s%d is %f", result, x, (b / a));break;
			}
		}
	}
}
