package hack;

/**
 * @author Digvijay
 *
 */
public class Hack3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println(steps(3));
		System.out.println(steps(2));
	}

	private static long steps(int n) {
		long combo1 = 1;
		// calculate combinations of 2s and 1s
		long m = n / 2;
		long e = m % 2;
		long combo2 = 0;
		for (long i = m; m > 0; m--) {
			combo2 += factorial(m + e + (m - i));
		}

		m = n / 3;
		e = n % 3;
		long combo3 = 0;
		if (n > 2) {
			for (long i = m; m > 0; m--) {
				int x = 0;
				x += factorial(m + e + (m - i));
				int y = 0;
				int z = 0;
				if (n > 4) {
					y += factorial(m + e + (m - i) + 1);

					if (e == 2) {
						y += factorial(m + e + (m - i) + 2);
					}
				}

				combo3 += (x + y + z);
			}
		}
		return combo1 + combo2 + combo3;
	}

	private static long factorial(long a) {
		if (a == 1)
			return 1;
		else
			return a * factorial(a - 1);
	}

}
