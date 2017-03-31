package leetcode.tree;

public class SumOfLeftLeaves {

	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}
		if (null != root.left && null == root.left.left
				&& null == root.left.right) {
			return root.left.val + sumOfLeftLeaves(root.right);
		} else {
			return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
		}
	}

}
