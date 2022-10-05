public class P20_Solution {
    public boolean validParentheses(String s) {
        boolean valid = false;

        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ')' && s.charAt(i-1) == '(') {
                valid = true;
                i--;
            } else if (s.charAt(i) == ']' && s.charAt(i-1) == '[') {
                valid = true;
                i--;
            } else if (s.charAt(i) == '}' && s.charAt(i-1) == '{') {
                valid = true;
                i--;
            } else {
                return false;
            }
        }
        return valid;
    }
}
