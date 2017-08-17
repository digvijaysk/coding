package hack.vmware;

import java.util.Scanner;

public class Memory {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();

		int mem = stdin.nextInt();
		int availMem = mem;
		int lapseTime = 0;
		int start = 0;
		int end = 0;

		int small = 0;

		int time=0;
		int j=0;
		int dur = stdin.nextInt();
		int m = stdin.nextInt();
		while (true){
			if(j == n){
				break;
			}
			
			
		}
		for (int i = 0; i < n; i++) {

			
			if (availMem > m) {
				availMem = availMem - m;
				if (small > dur) {
					small = dur;
				}
			} else {
				lapseTime += small;

			}

		}

		stdin.close();

	}

}

class Proc {
	public int dur;
	public int mem;

	public Proc(int dur, int mem) {
		this.dur = dur;
		this.mem = mem;
	}
}
