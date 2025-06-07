package me.zhenique.medium;
/*
https://leetcode.com/problems/shifting-letters
 */
public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder answer = new StringBuilder();
        int shiftSum = 0;
        for (int i : shifts) {
            shiftSum = (shiftSum + i) % 26;
        }
        for (int i = 0; i < s.length(); ++i) {
            int index = s.charAt(i) - 'a';
            char shiftedChar = (char) ((index + shiftSum) % 26 + 'a');
            answer.append(shiftedChar);
            shiftSum = Math.floorMod(shiftSum - shifts[i], 26);
        }
        return answer.toString();
    }
}
