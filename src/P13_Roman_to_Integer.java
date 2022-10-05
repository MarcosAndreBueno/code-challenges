/*
I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.

Input: s = "III"
Output: 3

Input: s = "LVIII"
Output: 58

Input: s = "MCMXCIV"
Output: 1994

Constraint:
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/

import java.util.ArrayList;

public class P13_Roman_to_Integer {
    public static void main(String[] args) {
        System.out.println(new P13_Solution().romanToInteger(new char[] {'X','L','I','I','I'}));
        System.out.println(new P13_Solution().romanToInteger(new char[] {'X','X','V','I','I'}));
        System.out.println(new P13_Solution().romanToInteger(new char[] {'L','V','I','I','I'}));
        System.out.println(new P13_Solution().romanToInteger(new char[] {'C','L','I','I','I','V'}));
        System.out.println(new P13_Solution().romanToInteger(new char[] {'M','C','C','M','X','X','V','I','I'}));
    }
}
