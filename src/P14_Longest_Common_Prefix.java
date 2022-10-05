public class P14_Longest_Common_Prefix {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();
        int oldLength = strs[0].length();

        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < oldLength) {
                oldLength = strs[i].length();
            }
        }

        int idx = 1;
        boolean eq = false;
        for (int i = 0; i < oldLength; i++) {
            while (idx < strs.length) {
                eq = strs[0].charAt(i) == strs[idx].charAt(i);
                idx ++;
            }
            if (eq) {
                result.append("").append(strs[0].charAt(i));
            } else {
                break;
            }
            eq = false;
            idx = 1;
        }

        if (result.isEmpty()) {
            result.append("Nao ha prefixo comum");
        }

        return result.toString();
    }
}