/**
 * Create a function which counts the number of occurrences of a given letter in a string.
 */

import java.util.Scanner;

public class Task1 {

	public static int occur(String str, char letter) {
		int occ = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				occ++;
			}
		}
		return occ;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence or word: ");
		String str = scan.nextLine().toLowerCase();

		System.out.println("Enter a letter: ");
		char letter = scan.nextLine().toLowerCase().charAt(0);

		System.out.println("The letter " + letter + " occurs " + occur(str, letter) + " times.");
		scan.close();
	}

}
