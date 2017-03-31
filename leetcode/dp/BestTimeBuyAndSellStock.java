package leetcode.dp;

public class BestTimeBuyAndSellStock {

	public int maxProfit(int[] prices) {
		int profit = 0;
		int n = prices.length;
		if (n > 1) {
			int profitPre = prices[1] - prices[0];
			if (profitPre > profit) {
				profit = profitPre;
			}
			int profitNext = profitPre;
			for (int i = 2; i < n; i++) {
				if (profitPre > 0) {
					profitNext = profitPre + prices[i] - prices[i - 1];
				} else {
					profitNext = prices[i] - prices[i - 1];
				}
				profitPre = profitNext;
				if (profitNext > profit) {
					profit = profitNext;
				}
			}
		}
		return profit;
	}

}
