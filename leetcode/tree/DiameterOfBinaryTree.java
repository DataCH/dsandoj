package leetcode.tree;

public class DiameterOfBinaryTree {

	public int treeHeight(TreeNode root) {
		if (null == root) {
			return 0;
		}
		int lh = treeHeight(root.left);
		int rh = treeHeight(root.right);
		return lh >= rh ? lh + 1 : rh + 1;
	}

	public int diameterOfBinaryTree(TreeNode root) {
		if (null == root) {
			return 0;
		}
		int maxVal = treeHeight(root.left) + treeHeight(root.right);
		int leftRes = diameterOfBinaryTree(root.left);
		int rightRes = diameterOfBinaryTree(root.right);
		if (leftRes > maxVal) {
			maxVal = leftRes;
		}
		if (rightRes > maxVal) {
			maxVal = rightRes;
		}
		return maxVal;
	}

}
