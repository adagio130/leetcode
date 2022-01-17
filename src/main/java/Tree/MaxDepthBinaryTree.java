package Tree;

import Tree.Model.TreeNode;

import java.util.Stack;

public class MaxDepthBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.getLeft());
        int right = maxDepth(root.getRight());
        return Math.max(left, right) + 1;
    }
}
