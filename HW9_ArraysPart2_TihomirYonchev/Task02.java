
public class Task02 {

	public static void main(String[] args) {

		int[][] arr1 = { { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 } };

		int counter = 0;
		int sum1 = arr1[0][0] + arr1[0][1] + arr1[0][2] + arr1[0][3];
		int sum2 = 0;

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < arr1[0].length; j++) {
				sum2 += arr1[i][j];
			}
			if (sum1 == sum2) {
				sum2 = 0;
			} else {
				System.out.println("Not happy ;-(");
				break;
			}
			if (counter == i - 1) {
				System.out.println("Happy table :-)");
			}
		}
	}
}
