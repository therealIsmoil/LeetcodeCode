public class Solution_2441 {
    /**
     * Accepted
     * */
    public int findMaxK(int[] nums) {
        int temp = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] + nums[j] == 0) {
                    if (temp < Math.abs(nums[i])) {
                        temp = Math.abs(nums[i]);
                    }
                    break;
                }
            }
        }

        return temp;
    }
}
