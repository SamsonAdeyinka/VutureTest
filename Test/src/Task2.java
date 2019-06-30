import java.util.Scanner;

public class Task2 {

	public static boolean palidrome(String str) {
		
		String rev = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence or word: ");
		String str = scan.nextLine().replaceAll("[^a-zA-Z]", "").toLowerCase();
		
		System.out.println(palidrome(str));
		scan.close();
	}

}
