import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Arrays length: ");
		int length = sc.nextInt();
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];
		int[] arr3 = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d, in Array 1: ", i + 1);
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d, in Array 2: ", i + 1);
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < length; i++) {
			if (i % 2 == 0) {
				arr3[i] = arr2[i];
			} else {
				arr3[i] = arr1[i];
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + ", ");
		}

	}
}
