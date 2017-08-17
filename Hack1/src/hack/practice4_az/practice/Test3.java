package hack.amazon.practice;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		int[] input = new int[] { 1, 2, 4, 7, 8, 9, 100, 200, 300, 400, 500 };
		getPairsWithHashMap(input, 10);
	}

	static void getPairs(int[] input, int x) {

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] + input[j] == x) {
					System.out.printf("(%d, %d)", input[i], input[j]);
					break;
				}

			}
		}
	}

	static void getPairsWithHashMap(int[] input, int x) {
		// HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (list.contains(Math.abs(x - input[i]))) {
				while (list.contains(Math.abs(x - input[i]))) {
					System.out.printf("(%d, %d)", input[i], x - input[i]);
					list.remove(x - input[i]);
				}
			} else {
				list.add(input[i]);
			}

		}
	}
}