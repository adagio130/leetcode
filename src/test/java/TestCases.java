import org.junit.Test;

public class TestCases {

    @Test
    public void TestRemoveDuplicates(){
        int[] nums = {1, 1, 2}; // Input array
        int[] expectedNums = {1, 2}; // The expected answer with correct length
        RemoveDuplicates remover = new RemoveDuplicates();
        int k = remover.removeDuplicates(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
