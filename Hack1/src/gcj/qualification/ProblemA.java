/**
 * 
 */
package gcj.qualification;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author Digvijay
 *
 */
public class ProblemA {

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("A-large.in"));
		int T = sc.nextInt();
		sc.nextLine();

		for (int t = 1; t <= T; t++) {
			String str = sc.nextLine();
			String strA[] = str.split(" ");

			char[] cakes = strA[0].toCharArray();
			int k = Integer.parseInt(strA[1]);

			int size = cakes.length;
			int in[] = new int[size];
			int start = 0;
			int end = size - 1;
			boolean done = false;
			int count = 0;
			for (int i = 0; i < size; i++) {

				if (cakes[i] == '+') {
					in[i] = -1;
					if (!done) {
						start++;
					}
				} else {
					if (!done) {
						done = true;
					}
					in[i] = 0;
				}
			}
			while (true) {
				if (start< size && in[start] == -1) {
					start++;
				} else if (start + k - 1 < size) {
					start = swap(in, start, start + k);
					count++;
				} else {
					break;
				}

			}

			if (start == size) {
				System.out.println("Case #" + t + ": " + count);
			} else {
				System.out.println("Case #" + t + ": IMPOSSIBLE");
			}

		}
	}

	private static int swap(int[] input, int start, int end) {
		boolean done = false;
		for (int i = start; i < end; i++) {
			input[i] = ~input[i];
			if (!done) {
				if (input[i] == -1) {
					start++;
				} else {
					done = true;
				}
			}
		}
		return start;
	}
}
