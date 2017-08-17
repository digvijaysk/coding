package bloomberg.codecon;

import java.util.Scanner;

public class Chocolate {
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		/*
		 * while (stdin.hasNextLine()) { System.out.println(stdin.nextLine()); }
		 */
		int p = stdin.nextInt();
		int w = stdin.nextInt();
		int f = stdin.nextInt();

		for (int i = 0; i < f; i++) {
			int money = stdin.nextInt();
			int chocs = money / p;
			int wrapperChocs = chocs / w;
			int remainder = chocs % w;
			int totalWraps = wrapperChocs + remainder;
			chocs += wrapperChocs;

			while ((totalWraps / w) > 0) {
				wrapperChocs = totalWraps / w;
				remainder = totalWraps % w;
				chocs += wrapperChocs;
				totalWraps = wrapperChocs + remainder;
			}
			System.out.println(chocs);
		}
		stdin.close();
	}
}
