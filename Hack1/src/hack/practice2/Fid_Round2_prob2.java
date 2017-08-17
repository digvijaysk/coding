package hack.prajakta;

import java.util.Stack;

public class Fid_Round2_prob2 {

	public static void main(String[] args) {
		System.out.println(findMachingPattern("AaBCDdcbz"));
	}

	private static int findMachingPattern(String input) {

		int outIndex = -1;
		String first = input.substring(0, 1);
		Stack<String> stack = new Stack<>();
		if (first.equals(first.toLowerCase())) {
			return -1;
		}
		stack.push(first);
		String current = null;
		for (int i = 1; i < input.length(); i++) {
			current = input.substring(i, i + 1);

			if (current.equals(current.toUpperCase())) {
				stack.push(current);
			} else if ((!stack.isEmpty()) && current.equals(stack.peek().toLowerCase())) {
				outIndex = i;
				stack.pop();
			} else {
				break;
			}

		}
		return outIndex;

	}

}
