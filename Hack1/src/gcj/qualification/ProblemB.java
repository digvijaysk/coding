package gcj.qualification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("B-large.in"));
		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 1; t <= T; t++) {
			String str = sc.nextLine();

			long n = Long.parseLong(str);
			long x = n;
			if (n < 10) {
				System.out.println("Case #" + t + ": " + n);
				continue;
			}
			// while (true) {
			char[] chars = String.valueOf(n).toCharArray();
			int len = chars.length;

			int mod = (int) x % 10;
			x = x / 10;
			boolean changed = false;

			for (int i = 1; i < len; i++) {
				int mod2 = (int) x % 10;
				x = x / 10;
				if (mod <= mod2) {
					if ((mod == mod2)) {
						if (!changed) {
							continue;
						}
					}
					n = n - (n % (long) Math.pow(10, i));
					changed = true;
				}
				mod = mod2;
			}

			if (changed) {
				n--;
			}
			System.out.println("Case #" + t + ": " + n);
			// boolean success = true;

			/*
			 * if (success) { System.out.println("Case #" + t + ": " + n);
			 * break; } else { n--; }
			 */
			// }
		}
		sc.close();
	}

}
