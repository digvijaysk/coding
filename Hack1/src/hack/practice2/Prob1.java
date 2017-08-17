package hack.prajakta;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Prob1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(findFirstRepeatingCharacter(str));
		s.close();
	}

	private static String findFirstRepeatingCharacter(String s) {
		Set<Character> charSet = new HashSet<Character>();
		char[] chars = s.toCharArray();
		List<Character> pair = new ArrayList<Character>();

		for (char c : chars) {
			if (charSet.contains(c)) {
				pair.add(c);
				charSet.remove(c);
			} else {
				charSet.add(c);
			}
		}

		for (char c : chars) {
			if (pair.contains(c)) {
				return String.valueOf(c);
			}
		}

		return null;
	}

}