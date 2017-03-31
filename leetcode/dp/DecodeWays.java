package leetcode.dp;

public class DecodeWays {

	public int numDecodings(String s) {
		int res = 0;
		int n = s.length();
		if (n > 0) {
			if (s.charAt(0) == '0') {
				res = 0;
				return res;
			} else {
				res = 1;
			}
			for (int i = 1; i < n; i++) {
				if (s.charAt(i) != '0') {
					String subStr = s.substring(i - 1, i + 1);
					int tempVal = Integer.parseInt(subStr);
					String tempStr = String.valueOf(tempVal);
					if (tempVal <= 26 && tempStr.length() == subStr.length()) {
						res += 1;
					}
				} else if (s.charAt(i - 1) == '0') {
					res = 0;
					return res;
				} else {
					res -= 1;
				}
			}
		}
		return res;
	}

}
