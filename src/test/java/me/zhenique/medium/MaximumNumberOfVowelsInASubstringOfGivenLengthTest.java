package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    MaximumNumberOfVowelsInASubstringOfGivenLength actual = new MaximumNumberOfVowelsInASubstringOfGivenLength();

    @Test
    public void testExample1() {
        String s = "abciiidef";
        int k = 3;
        int expected = 3;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testExample2() {
        String s = "aeiou";
        int k = 2;
        int expected = 2;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testExample3() {
        String s = "leetcode";
        int k = 3;
        int expected = 2;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testNoVowels() {
        String s = "xyz";
        int k = 2;
        int expected = 0;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testAllVowels() {
        String s = "aei";
        int k = 3;
        int expected = 3;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testSingleCharacterSubstring() {
        String s = "hello";
        int k = 1;
        int expected = 1;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testKEqualsStringLength() {
        String s = "apple";
        int k = 5;
        int expected = 2;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testEarlyBreakCondition() {
        String s = "aeiouaeiou";
        int k = 3;
        int expected = 3;
        assertEquals(expected, actual.maxVowels(s, k));
    }

    @Test
    public void testMixedCharacters() {
        String s = "aexy";
        int k = 2;
        int expected = 2;
        assertEquals(expected, actual.maxVowels(s, k));
    }
}
