package bloomberg.codecon;

import java.util.Scanner;

public class InternalFragmentation {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int files = stdin.nextInt();
		int fileSizes[] = new int[files];

		stdin.nextLine();
		for (int i = 0; i < fileSizes.length; i++) {
			fileSizes[i] = stdin.nextInt();
		}

		int sectionSize = stdin.nextInt();

		int sectionsRequired = 0;
		for (int i = 0; i < fileSizes.length; i++) {
			int secs = fileSizes[i] / sectionSize;
			if (fileSizes[i] % sectionSize > 0) {
				secs++;
			}
			sectionsRequired += secs;
		}
		System.out.println(sectionSize * sectionsRequired);

		stdin.close();
	}

}
