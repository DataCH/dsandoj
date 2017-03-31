package leetcode.dp;

public class HouseRobber {

	public int rob(int[] nums) {
		int maxProfit = 0;
		int len = nums.length;
		if (len > 0) {
			if (1 == len) {
				return nums[0];
			}
			if (2 == len) {
				return nums[0] > nums[1] ? nums[0] : nums[1];
			}
			int profit_a = nums[0];
			int profit_b = nums[0] > nums[1] ? nums[0] : nums[1];
			int temp = 0;
			for (int i = 2; i < len; i++) {
				if (profit_a + nums[i] > profit_b) {
					temp = profit_a + nums[i];
				} else {
					temp = profit_b;
				}
				if (temp > maxProfit) {
					maxProfit = temp;
				}
				profit_a = profit_b;
				profit_b = temp;
			}
		}
		return maxProfit;
	}

}
