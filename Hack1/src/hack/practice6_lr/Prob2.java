package hack.liveramp;

import java.util.Arrays;

public class Prob2 {

	public static void main(String[] args) {
		int[] A = {2,1,2,1 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		int[] orderedArray = Arrays.copyOf(A, A.length);
		Arrays.sort(orderedArray);
		int i = 0;
		while (i < A.length && A[i] == orderedArray[i]) {
			i++;
		}

		if (i >= A.length) {
			return 0;
		}
		int start = i;

		int j = A.length - 1;
		while (j >= 0 && A[j] == orderedArray[j]) {
			j--;
		}
		int end = j;

		return end - start + 1;
	}

}
