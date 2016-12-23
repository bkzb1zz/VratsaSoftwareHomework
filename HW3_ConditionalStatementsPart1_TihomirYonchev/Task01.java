import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		double a = sc.nextDouble();

		System.out.print("Enter b: ");
		double b = sc.nextDouble();

		System.out.print("Enter c: ");
		double c = sc.nextDouble();

		double d = b * b - 4 * a * c;
		double x1 = 0;
		double x2 = 0;
		
		if (d >= 0) {
			x1 = (-b + Math.sqrt(d))/(2 * a);
			x2 = (-b - Math.sqrt(d))/(2 * a);
			
			System.out.printf("x1: %f\nx2: %f", x1, x2);
		}
		else {
			System.out.println("No real roots");
		}
	}
}
