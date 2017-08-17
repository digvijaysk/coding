package hack.sweta;

public class StringPair {

	public static void main(String[] args) {

		System.out.println(getLastMatchingIndex("AaBCDdbA"));
	}

	private static int getLastMatchingIndex(String input) {

		int outIndex = -1;
		String first = input.substring(0, 1);
		if (first.equals(first.toLowerCase())) {
			return -1;
		}
		String s = null;
		for (int i = 1; i < input.length(); i++) {
			s = input.substring(i, i + 1);
			if (s.equals(first.toLowerCase())) {
				outIndex = i;
			} else if (s.equals(s.toUpperCase())) {
				first = s;
			} else {
				return outIndex;
			}

		}
		return outIndex;

	}

}
