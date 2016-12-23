import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input area: ");
		int area = sc.nextInt();
		
		System.out.print("Is it in a good location(write true or false): ");
		Boolean isGoodLocation = sc.nextBoolean();
		
		if (area > 100) {
			System.out.println("Prestige apartment.");
		}
		else if(isGoodLocation == true){
			System.out.println("Prestige apartment.");
		}
		else {
			System.out.println("Not a prestige apartment, don't buy it!");
		}
	}
}
