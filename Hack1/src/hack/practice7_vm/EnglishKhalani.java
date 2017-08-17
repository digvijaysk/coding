package hack.vmware;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class EnglishKhalani {

	private static Map<String, KhalaniWord> map = new HashMap<String, KhalaniWord>();

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		stdin.nextLine();
		for (int i = 0; i < n; i++) {
			String str = stdin.nextLine();
			String[] words = str.split(" ");
			map.put(words[0], new KhalaniWord(words[1], Integer.parseInt(words[2])));
		}

		String str = stdin.nextLine();
		String[] words = str.split(" ");
		int m = Integer.parseInt(words[0]);
		List<KhalaniWord> list = new ArrayList<KhalaniWord>();
		for (int i = 1; i <= m; i++) {
			KhalaniWord next = map.get(words[i]);
			if (next != null) {
				list.add(next);
			}
		}
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).word);
			if (i != list.size() - 1) {
				System.out.print(" ");
			}
		}
		stdin.close();
	}

}

class KhalaniWord implements Comparable<KhalaniWord> {
	public int weight;
	public String word;

	public KhalaniWord(String word, int weight) {
		this.weight = weight;
		this.word = word;
	}

	@Override
	public int compareTo(KhalaniWord o) {
		if (this.weight > o.weight)
			return -1;
		else if (this.weight < o.weight) {
			return 1;
		}
		return 0;
	}

}
