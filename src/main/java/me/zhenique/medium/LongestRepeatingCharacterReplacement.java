package me.zhenique.medium;

/*
https://leetcode.com/problems/longest-repeating-character-replacement/
 */

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] freqMap = new int[26];
        int windowSize = 0, frequency = 0, slowPointer = 0;
        for (int fastPointer = 0; fastPointer < s.length(); fastPointer++) {
            freqMap[s.charAt(fastPointer) - 'A']++;
            frequency = Math.max(frequency, freqMap[s.charAt(fastPointer) - 'A']);
            int currentWindow = fastPointer - slowPointer + 1;

            if (currentWindow - frequency > k) {
                freqMap[s.charAt(slowPointer) - 'A']--;
                slowPointer++;
            }
            currentWindow = fastPointer - slowPointer + 1;
            windowSize = Math.max(windowSize, currentWindow);
        }
        return windowSize;
    }
}
