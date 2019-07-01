import java.util.Scanner;

public class Task3B {

	public static String censorWord(String str, String censor) {
		
		String[] words = censor.split(", ");
		
		for (String x : words) {
			String censored = new String(new char[x.length()]).replace("\0", "*");
			str = str.toLowerCase().replace(x, censored);
		}
		return str;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence or word: ");
		String str = scan.nextLine().toLowerCase();

		System.out.println("Enter words you'll like to censor (use commers): ");
		String censor = scan.nextLine().toLowerCase();
		
		System.out.println(censorWord(str, censor));

		scan.close();
		
		
	}

}
