package hack.amazon.practice;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println(Test.hammingWeight(2147483648L));
	}

	public static int hammingWeight(long n) {
		List<Long> binary = new ArrayList<Long>();
		int count = 0;
		if (n < 1) {
			return 0;
		} else {
			while (n != 0) {
				binary.add((long) n % 2);
				n = n / 2;
			}

			for (long i : binary) {
				if (i == 1) {
					count++;
				}
			}

			return count;

		}
	}

}
