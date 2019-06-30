import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Task3A {

	static int occur(String str, String word) {
		
		int occ = 0;
		String[] x = str.split(" ");
		
		for (int i = 0; i < x.length; i++) {
			
			if (word.equals(x[i])) {
				occ++;
			}
		}
		return occ;
	}
	
	
	public static void main(String[] args) {

		String str = "Hello my name is Samson name";
		String word = "name";
		System.out.println(occur(str, word));
		
	}

}
