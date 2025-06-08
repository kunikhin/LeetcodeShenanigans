package me.zhenique.medium;

import java.util.Set;

/*
https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int maxVowels(String s, int k) {
        Set<Character> vowelSet = Set.of('a', 'e', 'i', 'o', 'u');
        int current = 0, max = 0, left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (vowelSet.contains(s.charAt(right)))
                current++;
            if ((right - left + 1) > k) {
                if (vowelSet.contains(s.charAt(left)))
                    current--;
                left++;
            }
            max = Math.max(max, current);
            if (max == k)
                break;
        }
        return max;
    }
}
