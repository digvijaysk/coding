package hack.amazon.practice;

import java.util.HashSet;
import java.util.Set;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("c"));
	}

	public static int lengthOfLongestSubstring(String s) {
		String max = "";
		Set<String> set1 = new HashSet<String>();
		StringBuilder temp = new StringBuilder();
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			String x = s.substring(i, i + 1);
			if (set1.contains(x)) {

				if (max.length() < temp.length()) {
					max = temp.toString();
				}
				set1 = new HashSet<String>();
				temp = new StringBuilder();
			}

			set1.add(x);
			temp.append(x);

		}
		return max.length();
	}
}
