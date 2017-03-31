package ds.tree.binarysearchtree;

import ds.tree.TreeNode;

public class BSTTest {

	public static void main(String[] args) {
		BinarySearchTree t = new BinarySearchTree();

		TreeNode root = null;

		root = t.insertRecursively(root, 12);
		root = t.insertRecursively(root, 5);
		root = t.insertRecursively(root, 18);
		root = t.insertRecursively(root, 2);
		root = t.insertRecursively(root, 9);
		root = t.insertRecursively(root, 15);
		root = t.insertRecursively(root, 19);
		root = t.insertRecursively(root, 17);
		root = t.insertIteratively(root, 13);

		System.out.println(TreeTraverse.InOrderTraverse(root));
	}

}
