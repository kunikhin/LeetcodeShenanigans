package me.zhenique.medium;
/*
https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/
 */
public class MinimumDeletionsToMakeStringBalanced {
    public int minimumDeletions(String s) {
        int answer = 0, bCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'b') bCounter++;
            else answer = Math.min(answer+1, bCounter);
        }
        return answer;
    }
}
