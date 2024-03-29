/**
 * Create a function which counts the number of occurrences of words from a "censored words list" in a text.
 */

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Task3A {

	static void counter(String input, String censor) {
		HashMap<String, Integer> strCount = new HashMap<String, Integer>();
		String[] strArray = input.split(" ");
		String[] strList = censor.split(", ");

		for (String str : strArray) {
			for (int i = 0; i < strList.length; i++) {
				if (strList[i].equals(str)) {
					if (strCount.containsKey(str)) {
						strCount.put(str, strCount.get(str) + 1);
					} else {
						strCount.put(str, 1);
					}
				}
			}
		}
		for (Entry<String, Integer> entry : strCount.entrySet()) {
			System.out.println(entry.getKey() + " occurs: " + entry.getValue() + " times");
		}

	} 

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter sentence or word: ");
		String str = scan.nextLine().toLowerCase();

		System.out.println("Enter words you'll like to censor (use commers): ");
		String censor = scan.nextLine().toLowerCase();

		counter(str, censor);

		scan.close();




	}
}

