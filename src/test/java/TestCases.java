import Tree.Model.BinaryTree;
import Tree.Model.TreeNode;
import org.junit.Test;

public class TestCases {

    @Test
    public void TestRemoveDuplicates() {
        int[] nums = {1, 1, 2}; // Input array
        int[] expectedNums = {1, 2}; // The expected answer with correct length
        RemoveDuplicates remover = new RemoveDuplicates();
        int k = remover.removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    @Test
    public void TestRotate() {
        int k = 3;
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        Rotate rotator = new Rotate();
        rotator.rotate(nums, k);
    }

    @Test
    public void TestMaxDeptBTree() {
        int[] testSample = {3, 9, 20, 0, 0, 15, 7};
//        MaxDepthBinaryTree maxDepthBinaryTree = new MaxDepthBinaryTree();
    }

    @Test
    public void createBinaryTree(){
        int[] testSample = {0, 9, 20, 3, 0, 15, 7};
        BinaryTree BTree = new BinaryTree(testSample);
        for(Integer nodeValue : BTree.inorderTraversal()){
            System.out.println(nodeValue);
        }
    }
}
