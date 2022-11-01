public class Solution_1464 {
    /**
     * Accepted
     * */
    public static int maxProduct(int[] nums) {
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        System.out.println(max1);
        System.out.println(max2);

        return (max1 - 1) * (max2 - 1);
    }

    public static void main(String[] args) {
        int a[] = new int[]{10, 2, 5, 2};
        maxProduct(a);

    }



}
