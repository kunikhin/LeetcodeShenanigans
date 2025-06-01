package me.zhenique.medium;
/*
https://leetcode.com/problems/longest-palindromic-substring/
 */

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int[] borders = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {
            int lenOdd = expand(i, i, s);
            if (lenOdd > borders[1] - borders[0] + 1) {
                int distance = lenOdd / 2;
                borders[0] = i - distance;
                borders[1] = i + distance;
            }

            int lenEven = expand(i, i + 1, s);
            if (lenEven > borders[1] - borders[0] + 1) {
                int distance = (lenEven / 2) - 1;
                borders[0] = i - distance;
                borders[1] = i + 1 + distance;
            }
        }
        return s.substring(borders[0], borders[1] + 1);
    }
    private int expand(int left, int right, String s) {
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
