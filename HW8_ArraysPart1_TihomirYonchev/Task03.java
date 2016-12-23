import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Arrays length: ");
		int length = sc.nextInt();
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];
		int counter = 0;

		for (int i = 0; i < length; i++) {
			System.out.printf("Enter element %d, in Array 1: ", i + 1);
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 6) {
				arr2[counter] = arr1[i];
				counter++;
			}
		}
		for (int i = 0; i < counter; i++) {
			System.out.print(arr2[i] + ", ");
		}
	}
}
