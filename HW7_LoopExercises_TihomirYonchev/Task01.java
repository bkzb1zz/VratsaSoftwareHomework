import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter what kind of calcutaions would you like to use.");
		System.out.println("To Add(+) type: 1");
		System.out.println("To Subtract(-) type: 2");
		System.out.println("To Product(*) type: 3");
		System.out.println("To Divide(/) type: 4");
		System.out.println("For Modular Division(%) type: 5");
		System.out.print("Enter option: ");
		int choice = sc.nextInt();

		System.out.print("Type number 'a': ");
		double a = sc.nextInt();
		System.out.print("Type number 'b': ");
		double b = sc.nextInt();

		if (choice == 1) {
			System.out.printf("The sum of %f and %f is %f", a, b, a + b);
		} else if (choice == 2) {
			System.out.printf("The subtraction of %f and %f is %f", a, b, a - b);
		} else if (choice == 3) {
			System.out.printf("The product of %f and %f is %f", a, b, a * b);
		} else if (choice == 4) {
			System.out.printf("The division of %f and %f is %f", a, b, a / b);
		} else if (choice == 5) {
			System.out.printf("The modular division of %f and %f is %f", a, b, a % b);
		}
	}
}
