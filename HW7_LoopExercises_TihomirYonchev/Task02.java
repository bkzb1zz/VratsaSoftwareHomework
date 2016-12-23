import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int floor = 6;
		int apartmentNumber = 10;

		String orientation = new String();
		String roomNumber = new String();
		int roomsInApartment = 0;
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= floor; i++) {
			for (int j = 1; j <= apartmentNumber; j++) {

				if (j <= 9) {
					roomNumber = i + "0" + j;
				} else {
					roomNumber = i + "" + j;
				}
				if (j <= 5) {
					orientation = "West";
				} else {
					orientation = "East";
				}
				if (j == 5 || j == 10) {
					roomsInApartment = 4;
				} else if (j % 2 == 0) {
					roomsInApartment = 2;
				} else {
					roomsInApartment = 3;
				}
				sb.append(i + ", " + roomNumber + ", " + roomsInApartment + ", " + orientation);
				System.out.println(sb.toString());
				sb.setLength(0);
			}
		}
	}
}
