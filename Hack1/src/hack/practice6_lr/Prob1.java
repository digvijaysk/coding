package hack.liveramp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Prob1 {

	public static void main(String[] args) {
		System.out.println(solution(9,8,2,1));
	}

	public static String solution(int A, int B, int C, int D) {
		Integer[] input = { A, B, C, D };
		List<Integer> inputList = Arrays.asList(input);
		Collections.sort(inputList, Collections.reverseOrder());
		List<Integer> firstPlaceList = new ArrayList<Integer>();
		for (int x : inputList) {
			if (x <= 2 && !firstPlaceList.contains(x)) {
				firstPlaceList.add(x);
			}
		}

		// H1H2:M1M2
		int h1 = 0, h2 = 0, m1 = 0, m2 = 0;
		boolean success = false;
		for (int first : firstPlaceList) {
			h1 = first;
			List<Integer> tempList = new ArrayList<>(inputList);
			int index = tempList.indexOf(first);
			tempList.remove(index);
			boolean secondSuccess = false;
			for (Iterator<Integer> iter = tempList.listIterator(); iter.hasNext();) {
				int second = iter.next();
				if ((first == 2 && second <= 3) || first < 2) {

					h2 = second;
					iter.remove();
					secondSuccess = true;
					break;
				}

			}
			if (!secondSuccess) {
				break;
			}
			boolean thirdSuccess = false;
			for (Iterator<Integer> iter = tempList.listIterator(); iter.hasNext();) {
				int third = iter.next();
				if (third <= 5) {
					m1 = third;
					iter.remove();
					thirdSuccess = true;
					break;
				}

			}
			if (!thirdSuccess) {
				continue;
			}

			m2 = tempList.get(0);
			success = true;
			break;
		}

		if (success) {
			return new StringBuffer().append(h1).append(h2).append(":").append(m1).append(m2).toString();
		} else {
			return "NOT POSSIBEL";
		}

	}

}
