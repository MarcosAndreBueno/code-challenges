/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/

public class P14_Solution {
    public static void main(String[] args) {
        System.out.println(P14_Longest_Common_Prefix.longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(P14_Longest_Common_Prefix.longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(P14_Longest_Common_Prefix.longestCommonPrefix(new String[] {"sapo","sapato","sapiens"}));
        System.out.println(P14_Longest_Common_Prefix.longestCommonPrefix(new String[] {"sapo","sapato","carro"}));
    }
}
