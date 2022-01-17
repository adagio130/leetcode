package Tree;

import Tree.Model.TreeNode;

import java.util.Stack;

public class IsValidBTree {
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        TreeNode pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }
            root = stack.pop();
            if (pre != null && root.getValue() <= pre.getValue()) {
                return false;
            }
            pre = root;
            root = root.getRight();
        }
        return true;
    }

}
