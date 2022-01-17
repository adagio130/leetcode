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
        this.left = null;
        this.right = null;
    }

    TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


}
