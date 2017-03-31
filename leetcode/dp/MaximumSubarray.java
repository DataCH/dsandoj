package leetcode.dp;

public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		int res = 0;
		int n = nums.length;
		if (n > 0) {
			int temp = nums[0];
			res = temp;
			for (int i = 1; i < n; i++) {
				if (temp > 0) {
					temp += nums[i];
				} else {
					temp = nums[i];
				}
				if (temp > res) {
					res = temp;
				}
			}
		}
		return res;
	}

}
