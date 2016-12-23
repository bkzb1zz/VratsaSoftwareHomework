
public class Task03 {

	public static void main(String[] args) {

		int[][] arr1 = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 } };

		int sum = 0;
		for (int i = 0; i < arr1[0].length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j] + " ");
				sum += arr1[i][j];
			}
			System.out.printf("- The sum for this line is: %d", sum);
			sum = 0;
			System.out.println();
		}
	}
}
