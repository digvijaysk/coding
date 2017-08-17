package hack.vmware;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Sticks {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int t = stdin.nextInt();

		for (int i = 0; i < t; i++) {
			int n = stdin.nextInt();
			if (n < 4) {
				System.out.println("0");
				break;
			}
			stdin.nextLine();
			String str = stdin.nextLine();
			String[] sticks = str.split(" ");
			Set<String> set = new HashSet<String>();
			int pairs = 0;
			for (String s : sticks) {
				if (set.contains(s)) {
					set.remove(s);
					pairs++;
				} else {
					set.add(s);
				}

			}
			System.out.println(pairs / 2);

		}

		stdin.close();
	}

}
