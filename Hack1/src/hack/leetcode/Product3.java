package hack.leetcode;

public class Product3 {
	public static int maxProduct(int[] nums) {
		int length = nums.length;
		int product = nums[0];
		int maxProduct = nums[0];
		int fromIndex = 0;
		int toIndex = 0;
		// ArrayList<Integer> neg = new ArrayList<Integer>();
		for (int i = 1; i < length; i++) {
			if (nums[i] == 0) {
				if (maxProduct < product) {
					maxProduct = product;
					fromIndex = i+1;
				}
				else{
					toIndex = i;
				}
				product = 1;
				
			} else {
				product *= nums[i];
			}

		}
		if (maxProduct < product) {
			maxProduct = product;
		}

		if (maxProduct > 0)

		{
			return maxProduct;
		}
		for (int i = 0; i < length; i++) {
			
			if (nums[i] != 0) {
				product /= nums[i];
			}
			// product = 1;
		}

		return maxProduct;
	}

	public static void main(String args[]) {
		maxProduct(new int[] {});
	}
}