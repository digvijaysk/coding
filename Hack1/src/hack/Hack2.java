package hack;

/**
 * @author Digvijay
 *
 */
public class Hack2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(reverseString("high"));
	}

	private static String reverseString(String str) {
		char[] chrs = str.toCharArray();
		char[] output = new char[chrs.length];

		for (int i = 0; i < chrs.length; i++) {
			output[chrs.length - 1 - i] = chrs[i];
		}

		return String.valueOf(output);
	}

}
