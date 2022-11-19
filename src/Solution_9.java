public class Solution_9 {
    /**
     * Accepted
     */
    public static boolean isPalindrome(int x) {
//        int count = 1;
//        int a = x;
//
//        if (x < 0)
//            return false;
//        if (x < 10)
//            return true;
//
//        do {
//            count++;
//            a = a / 10;
//        } while (a > 9);
//
//        System.out.println(count);
//        for (int i = 0; i < count / 2; i++) {
//            int start = (((int) (x / Math.pow(10.0, (count - i - 1)))) % 10);
//            int end = (int) ((x % Math.pow(10.0, i + 1)) / Math.pow(10.0, i));
//
//            System.out.println(start);
//            System.out.println(end);
//
//            if (start != end)
//                return false;
//        }
//        return true;

        if (x < 0)
            return false;
        if (x < 10)
            return true;

        String str = String.valueOf(x);

        for (int i = 0; i < str.length(); i++) {
            if (!str.substring(i, i + 1).equals(str.substring(str.length() - i - 1, str.length() - i)))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrome(1001);
    }
}
