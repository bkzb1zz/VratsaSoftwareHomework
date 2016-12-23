import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Car years: ");
		int carYears = sc.nextInt();
		
		System.out.print("Car price: ");
		int carPrice = sc.nextInt();

		if (carYears > 5 && carPrice > 20000) {
			System.out.println("High class car");
		} 
		else if(carYears >= 5 && carPrice > 40000) {
			System.out.println("High class car");
		}
		else{
			System.out.println("Not a high class car");
		}
	}
}
