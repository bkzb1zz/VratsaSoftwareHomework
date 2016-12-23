import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter text: ");
		String text = sc.nextLine();
		char[] charText = text.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text.length(); i++) {
			if (charText[i] == 'a' || charText[i] == 'A') {
				continue;
			}
			else {
				sb.append(charText[i]);
			}
		}
		System.out.println(sb);
	}
}
