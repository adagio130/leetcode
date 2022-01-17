package Tree;

import Tree.Model.TreeNode;

import java.util.*;

public class IsSymmetric {
    public boolean isSymmetricRecursive(TreeNode root) {
        return root == null || isSymmetric(root.getLeft(), root.getRight());
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.getValue() != right.getValue()) {
            return false;
        }
        return isSymmetric(left.getLeft(), right.getRight()) && isSymmetric(left.getRight(), right.getLeft());
    }

    public boolean isSymmetricIterative(TreeNode root) {
        if (root == null) {
            return true;
        }

        Stack<TreeNode> stack = new Stack<>();
        if (root.getLeft() != null) {
            if (root.getRight() == null) {
                return false;
            }
            stack.push(root.getLeft());
            stack.push(root.getRight());
        } else if (root.getRight() != null) {
            return false;
        }
        while (!stack.empty()) {
            if (stack.size() % 2 != 0) {
                return false;
            }
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();
            if (left.getValue() != right.getValue()) {
                return false;
            }
            if (left.getLeft() != null) {
                if (right.getRight() == null) {
                    return false;
                }
                stack.push(left.getLeft());
                stack.push(right.getRight());
            } else if (right.getRight() != null) {
                return false;
            }
            if (left.getRight() != null) {
                if (right.getLeft() == null) {
                    return false;
                }
                stack.push(left.getRight());
                stack.push(right.getLeft());
            } else if (right.getLeft() != null) {
                return false;
            }
        }
        return true;
    }
}
