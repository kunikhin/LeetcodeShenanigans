package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement actual = new LongestRepeatingCharacterReplacement();

    @Test
    void testExample1() {
        assertEquals(4, actual.characterReplacement("ABAB", 2));
    }

    @Test
    void testExample2() {
        assertEquals(4, actual.characterReplacement("AABABBA", 1));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(5, actual.characterReplacement("XXXXX", 2));
    }

    @Test
    void testNoChangesAllowed() {
        assertEquals(3, actual.characterReplacement("AAABBB", 0));
    }

    @Test
    void testEntireStringReplaceable() {
        assertEquals(6, actual.characterReplacement("AABAAB", 2));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1, actual.characterReplacement("A", 0));
    }

    @Test
    void testSingleCharacterWithChanges() {
        assertEquals(1, actual.characterReplacement("B", 5));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, actual.characterReplacement("", 3));
    }

    @Test
    void testAllCharactersDifferent() {
        assertEquals(3, actual.characterReplacement("ABCDEFG", 2));
    }

    @Test
    void testComplexCase() {
        assertEquals(7,
                actual.characterReplacement("KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF", 4));
    }

    @Test
    void testMaxChangesNotUsed() {
        assertEquals(4, actual.characterReplacement("AABB", 10));
    }

}
