public class Solution_2011 {
    /**
     * Accepted
     * */
    public int finalValueAfterOperations(String[] operations) {
        int minus = 0;
        int plus = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("-")) {
                minus++;
            } else plus++;
        }

        return plus - minus;
    }
}
