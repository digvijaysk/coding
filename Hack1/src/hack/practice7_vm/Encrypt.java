package hack.vmware;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Encrypt {

	private static Map<Character, Integer> map = new HashMap<Character, Integer>();
	static {
		map.put('a', 0);
		map.put('b', 1);
		map.put('c', 2);
		map.put('d', 3);
		map.put('e', 4);
		map.put('f', 5);

		map.put('g', 6);
		map.put('h', 7);
		map.put('i', 8);
		map.put('j', 9);
		map.put('k', 10);
		map.put('l', 11);

		map.put('m', 12);
		map.put('n', 13);
		map.put('o', 14);
		map.put('p', 15);
		map.put('q', 16);
		map.put('r', 17);

		map.put('s', 18);
		map.put('t', 19);
		map.put('u', 20);
		map.put('v', 21);
		map.put('w', 22);
		map.put('x', 23);

		map.put('y', 24);
		map.put('z', 25);

	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		String input = stdin.nextLine();

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (map.get(c) != null) {
				int num = map.get(c);

				if (num < 10) {
					System.out.print(num);
				} else {
					System.out.print(num + "#");
				}
			} else {
				System.out.print(c);
			}
		}

		stdin.close();

	}

}
