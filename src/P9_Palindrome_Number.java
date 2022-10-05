/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

Follow up: Could you solve it without converting the integer to a string?
 */

public class P9_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(new P9_Solution().palindromeNumber(121));
        System.out.println(new P9_Solution().palindromeNumber(65800856));
        System.out.println(new P9_Solution().palindromeNumber(100));
        System.out.println(new P9_Solution().palindromeNumber(250));
        System.out.println(new P9_Solution().palindromeNumber(5225));
    }
}
