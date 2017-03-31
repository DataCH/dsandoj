package leetcode.tree;

public class TreeTest {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode node1 = new TreeNode(2);
		TreeNode node11 = new TreeNode(11);
		TreeNode node2 = new TreeNode(3);
		TreeNode node21 = new TreeNode(21);

		root.left = node1;
		root.right = node2;
		node1.left = node11;
		node2.left = node21;

/*		DiameterOfBinaryTree solution = new DiameterOfBinaryTree();
		System.out.println(solution.treeHeight(root.left));
		System.out.println(solution.treeHeight(root.right));
		System.out.println(solution.diameterOfBinaryTree(root));*/
		
		SumOfLeftLeaves solution = new SumOfLeftLeaves();
		System.out.println(solution.sumOfLeftLeaves(root));
	}

}
