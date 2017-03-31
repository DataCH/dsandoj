package ds.tree.binarysearchtree;

import ds.tree.TreeNode;

public class BinarySearchTree {

	/**
	 * 二叉搜索树查找，递归的方式实现
	 */
	public TreeNode searchRecursively(TreeNode root, int key) {
		if (null == root || key == root.val) {
			return root;
		}
		if (key < root.val) {
			return searchRecursively(root.left, key);
		} else {
			return searchRecursively(root.right, key);
		}
	}

	/**
	 * 二叉搜索树查找，迭代的方式实现
	 */
	public TreeNode serchIteratively(TreeNode root, int key) {
		TreeNode currentNode = root;
		while (null != currentNode) {
			if (key == currentNode.val) {
				return currentNode;
			}
			if (key < currentNode.val) {
				currentNode = currentNode.left;
			} else {
				currentNode = currentNode.right;
			}
		}
		return null;
	}

	/**
	 * 二叉搜索树插入，递归的方式实现
	 */
	public TreeNode insertRecursively(TreeNode root, int x) {
		if (null == root) {
			root = new TreeNode(x);
		} else if (x < root.val) {
			root.left = insertRecursively(root.left, x);
		} else {
			root.right = insertRecursively(root.right, x);
		}
		return root;
	}

	/**
	 * 二叉搜索树插入，迭代的方式实现
	 */
	public TreeNode insertIteratively(TreeNode root, int x) {
		TreeNode parentNode = null;
		TreeNode currentNode = root;
		while (null != currentNode) {
			parentNode = currentNode;
			if (x < currentNode.val) {
				currentNode = currentNode.left;
			} else {
				currentNode = currentNode.right;
			}
		}
		if (null == parentNode) {
			root = new TreeNode(x);
		} else if (x < parentNode.val) {
			parentNode.left = new TreeNode(x);
		} else {
			parentNode.right = new TreeNode(x);
		}
		return root;
	}
	
	

}
