package me.zhenique.medium;
/*
https://leetcode.com/problems/find-all-anagrams-in-a-string/
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        int[] pFreq = new int[26], sFreq = new int[26];
        if (p.length() > s.length()) {
            return answer;
        }
        for (char c : p.toCharArray()) {
            pFreq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            sFreq[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                sFreq[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.equals(pFreq, sFreq)) {
                answer.add(i - p.length() + 1);
            }
        }
        return answer;
    }

    //using 1 freq map and stream
    public List<Integer> findAnagramsStream(String s, String p) {
        List<Integer> answer = new ArrayList<>();
        int[] freqMap = new int[26];
        for (char c : p.toCharArray()) {
            freqMap[c - 'a']--;
        }
        for (int i = 0; i < s.length(); i++) {
            freqMap[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                freqMap[s.charAt(i - p.length()) - 'a']--;
            }
            if (Arrays.stream(freqMap).allMatch(a -> a == 0)) {
                answer.add(i - p.length() + 1);
            }
        }
        return answer;
    }
}
