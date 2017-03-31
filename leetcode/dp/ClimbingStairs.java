package leetcode.dp;

public class ClimbingStairs {

	public int climbStairs(int n) {
		if (1 == n) {
			return 1;
		}
		if (2 == n) {
			return 2;
		}
		if (n > 2) {
			int step1 = 1;
			int step2 = 2;
			for (int i = 3; i <= n; i++) {
				int temp = step1 + step2;
				step1 = step2;
				step2 = temp;
			}
			return step2;
		}
		return 0;
	}

}
