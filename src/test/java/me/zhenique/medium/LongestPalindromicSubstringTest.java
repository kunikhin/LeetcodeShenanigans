package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromicSubstringTest {

    LongestPalindromicSubstring actual = new LongestPalindromicSubstring();

    @Test
    void emptyString() {
        assertEquals(" ", actual.longestPalindrome(" "));
    }

    @Test
    void singleCharacter() {
        assertEquals("a", actual.longestPalindrome("a"));
    }

    @Test
    void twoIdenticalCharacters() {
        assertEquals("aa", actual.longestPalindrome("aa"));
    }

    @Test
    void twoDifferentCharacters() {
        assertEquals("a", actual.longestPalindrome("ab")); // или "b" тоже допустимо
    }

    @Test
    void fullStringOddPalindrome() {
        assertEquals("racecar", actual.longestPalindrome("racecar"));
    }

    @Test
    void fullStringEvenPalindrome() {
        assertEquals("abba", actual.longestPalindrome("abba"));
    }

    @Test
    void leetcodeExample1() {
        String result = actual.longestPalindrome("babad");
        assert(result.equals("bab") || result.equals("aba"));
    }

    @Test
    void leetcodeExample2() {
        assertEquals("bb", actual.longestPalindrome("cbbd"));
    }

    @Test
    void endOfStringPalindrome() {
        assertEquals("aba", actual.longestPalindrome("zxcaba"));
    }

    @Test
    void middleOfStringPalindrome() {
        assertEquals("aba", actual.longestPalindrome("xyzabaxyz"));
    }

    @Test
    void repeatedCharacters() {
        assertEquals("aaa", actual.longestPalindrome("aaa"));
        assertEquals("aaaa", actual.longestPalindrome("aaaa"));
        assertEquals("aaaaaaaa", actual.longestPalindrome("aaaaaaaa"));
    }

    @Test
    void mixedEvenOddPalindrome() {
        assertEquals("aabbbbbbaa", actual.longestPalindrome("aabbbbbbaa"));
    }

    @Test
    void specialCharacters() {
        assertEquals("abc de ed cba", actual.longestPalindrome("abc de ed cba"));
    }

    @Test
    void numbersPalindrome() {
        assertEquals("12321", actual.longestPalindrome("12321"));
    }

    @Test
    void separatorCharacters() {
        assertEquals("a|b||b|a", actual.longestPalindrome("a|b||b|a"));
    }

    @Test
    void multipleSameLength() {
        String result = actual.longestPalindrome("abba/acca");
        assert(result.equals("abba") || result.equals("acca"));
    }
}
