
public class Task01 {

	public static void main(String[] args) {

		int[][] reviews = {
				{ 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 }, };
		double sum = 0;

		for (int i = 0; i < reviews[0].length - 1; i++) {
			sum += reviews[i][3];
		}
		System.out.println(sum / 3);
	}
}
