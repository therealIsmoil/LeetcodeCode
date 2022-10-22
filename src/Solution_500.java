public class Solution_500 {

    /**
     * Accepted
     */
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        boolean r1, r2, r3;
        r1 = r2 = r3 = false;

        String[] str = new String[20];
        int count = 0, index = 0;

        for (int i = 0; i < words.length; i++) {
            count = 1;
            if (row1.contains(words[i].substring(0, 1).toLowerCase())) {
                r1 = true;
                r2 = false;
                r3 = false;
            } else if (row2.contains(words[i].substring(0, 1).toLowerCase())) {
                r1 = false;
                r2 = true;
                r3 = false;
            } else if (row3.contains(words[i].substring(0, 1).toLowerCase())) {
                r1 = false;
                r2 = false;
                r3 = true;
            }

            for (int j = 1; j < words[i].length(); j++) {
                if ((r1 && row1.contains(words[i].substring(j, j + 1).toLowerCase()))) {
                    count++;
                } else if ((r2 && row2.contains(words[i].substring(j, j + 1).toLowerCase()))) {
                    count++;
                } else if ((r3 && row3.contains(words[i].substring(j, j + 1).toLowerCase()))) {
                    count++;
                }
            }

            if (count == words[i].length()) str[index++] = words[i];
        }

        String newStr[] = new String[index];

        for (int i = 0; i < index; i++) {
            newStr[i] = str[i];
        }

        return newStr;
    }
}
