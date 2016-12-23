import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Arrays length: ");
		int length = sc.nextInt();
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d, in Array 1: ", i + 1);
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d, in Array 2: ", i + 1);
			arr2[i] = sc.nextInt();
		}
		if ((arr1[0] == arr2[0]) && (arr1[length - 1] == arr2[length - 1])) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
