package hack;
public class Hack1 {
	public static void main(String[] args) {
		System.out.println(firstUniqueChar("xyzabcabcdxyz"));
	}

	static String firstUniqueChar(String input) {
		char[] arr = input.toCharArray();
		String out = null;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (i!=j && arr[i] == arr[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				out = String.valueOf(arr[i]);
				break;
			}

		}
		return out;
	}
}
