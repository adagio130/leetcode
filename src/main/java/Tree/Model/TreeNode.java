package Tree.Model;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
