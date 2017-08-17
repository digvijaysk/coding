package hack.amazon.practice;

import java.util.HashMap;

public class TotalHammingDistance {

	HashMap<Integer, String> map = new HashMap<Integer, String>();

	public int totalHammingDistance(int[] nums) {
		int totalHammingDistance = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int x = nums[i] ^ nums[j];
				totalHammingDistance += countOnes(x);
			}
		}
		return totalHammingDistance;
	}
	static int countOnes (int n) 
	{
	    int count=0;
	    while (n!=0)
	    {
	        n = n & (n-1);
	        count++;
	    }
	    return count;
	}
	public static void main(String[] args) {
		TotalHammingDistance thd = new TotalHammingDistance();
		System.out.println(thd.totalHammingDistance(new int[] { 4, 14, 2 }));

	}

}
