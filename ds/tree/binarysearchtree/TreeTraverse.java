package ds.tree.binarysearchtree;

import ds.tree.TreeNode;

public class TreeTraverse {

	/**
	 * 中序遍历
	 */
	public static String InOrderTraverse(TreeNode root) {
		StringBuilder res = new StringBuilder();
		if (null == root) {
			return res.toString();
		}
		res.append(InOrderTraverse(root.left));
		res.append(root.val).append(",");
		res.append(InOrderTraverse(root.right));
		return res.toString();
	}

}
