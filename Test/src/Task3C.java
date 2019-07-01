import java.util.Scanner;

public class Task3C {

	public static String censorPalin(String censor) {
		String[] words = censor.toLowerCase().split(" ");

		for (String x : words) {
			String rev = "";
			int length = x.length();
			for (int i = length - 1; i >= 0; i--) {
				rev = rev + x.charAt(i);
				if (x.equals(rev)) {
					String censored = new String(new char[x.length()]).replace("\0", "*");
					censor = censor.toLowerCase().replace(x, censored);
				}
			}
		}
		return censor;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence or word: ");
		String censor = scan.nextLine().replaceAll("[^a-zA-Z]", " ");

		System.out.println(censorPalin(censor));
		scan.close();

	}
}




