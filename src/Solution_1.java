public class Solution_1 {
    public int[] twoSum(int[] nums, int target) {

        int[] arr = new int[]{0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    i = j = nums.length;
                }
            }
        }
        return arr;
    }
}
