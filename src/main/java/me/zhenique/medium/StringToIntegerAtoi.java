package me.zhenique.medium;

/*
https://leetcode.com/problems/string-to-integer-atoi
*/
public class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int index = 0, result = 0, sign = 1;
        while(index < s.length() && s.charAt(index) == ' ') index++;
        if (index == s.length()) return result;
        if (s.charAt(index) == '-' || s.charAt(index) == '+') {
            sign = s.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while(index < s.length()) {
            int digit = s.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;
            if (Integer.MAX_VALUE / 10 < result ||
                    Integer.MAX_VALUE / 10 == result && Integer.MAX_VALUE % 10 < digit)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            result = result * 10 + digit;
            index++;
        }
        return result * sign;
    }
}
