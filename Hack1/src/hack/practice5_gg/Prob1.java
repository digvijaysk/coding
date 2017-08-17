package hack.google;

import java.util.HashMap;
import java.util.Map;

public class Prob1 {

	public String solution1(String S, int K) {
		// write your code in Java SE 8
		S = S.toUpperCase();
		StringBuilder x = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '-') {
				continue;
			}
			x.append(S.charAt(i));
		}
		int first = x.length() % K;
		boolean firstVisited = false;

		StringBuilder out = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '-') {
				continue;
			}
			if (out.length() > 0 && (!firstVisited && out.length() == first) || (out.length() % K == 0)) {
				if (!firstVisited) {
					firstVisited = true;
				}
				out.append("-");
			}
			out.append(S.charAt(i));

		}
		return out.toString();

	}

	public static int[] solution2(int[] A, int K) {
		// write your code in Java SE 8
		// there are N distinct integers in A
		int lastSubarrayStartIndex = A.length - K;
		int maxSubarrayStartIndex = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i <= lastSubarrayStartIndex; i++) {
			if (max < A[i]) {
				max = A[i];
				maxSubarrayStartIndex = i;
			}
		}
		int[] output = new int[K];
		for (int i = 0; i < K; i++) {
			output[i] = A[maxSubarrayStartIndex + i];
		}

		return output;
	}

	public static int[] solution(String A, String B) {
		// write your code in Java SE 8
		String[] arrA = A.split(" ");
		String[] arrB = B.split(" ");
		int freqArr[] = new int[11];
		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < arrA.length; i++) {
			int small = 99999;
			int f = 0;
			String x = arrA[i];
			for (int j = 0; j < x.length(); j++) {
				int c = x.charAt(j);
				if (c == small) {
					f++;
				} else if (c < small) {
					small = c;
					f = 1;
				}
			}
			freqArr[f]++;
		}
		freqMap.put(0, 0);
		freqMap.put(1, freqArr[0]);
		for (int i = 2; i < 11; i++) {
			freqMap.put(i, freqArr[i - 1] + freqMap.get(i - 1));
		}

		int[] output = new int[arrB.length];
		for (int i = 0; i < arrB.length; i++) {
			int small = 99999;
			int f = 0;
			String x = arrB[i];
			for (int j = 0; j < x.length(); j++) {
				int c = x.charAt(j);
				if (c == small) {
					f++;
				} else if (c < small) {
					small = c;
					f = 1;
				}
			}
			output[i] = freqMap.get(f);
		}

		return output;
	}

	public static void main(String[] args) {
	
		String A = "abcd aabc bd";
				String B = "aaa aa";
		solution(A, B);
		// System.out.println(solution(A, 4));
	}
}
