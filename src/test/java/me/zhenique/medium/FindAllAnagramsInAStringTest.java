package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindAllAnagramsInAStringTest {
    FindAllAnagramsInAString actual = new FindAllAnagramsInAString();

    @Test
    void testExample1() {
        List<Integer> result1 = actual.findAnagrams("cbaebabacd", "abc");
        List<Integer> result2 = actual.findAnagramsStream("cbaebabacd", "abc");
        List<Integer> expected = Arrays.asList(0, 6);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testExample2() {
        List<Integer> result1 = actual.findAnagrams("abab", "ab");
        List<Integer> result2 = actual.findAnagramsStream("abab", "ab");
        List<Integer> expected = Arrays.asList(0, 1, 2);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testNoAnagramsFound() {
        List<Integer> result1 = actual.findAnagrams("abcdefg", "xyz");
        List<Integer> result2 = actual.findAnagramsStream("abcdefg", "xyz");
        assertTrue(result1.isEmpty());
        assertTrue(result2.isEmpty());
    }

    @Test
    void testSingleCharacterPattern() {
        List<Integer> result1 = actual.findAnagrams("banana", "a");
        List<Integer> result2 = actual.findAnagramsStream("banana", "a");
        List<Integer> expected = Arrays.asList(1, 3, 5);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testFullStringIsAnagram() {
        List<Integer> result1 = actual.findAnagrams("listen", "silent");
        List<Integer> result2 = actual.findAnagramsStream("listen", "silent");
        List<Integer> expected = List.of(0);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testOverlappingAnagrams() {
        List<Integer> result1 = actual.findAnagrams("ababab", "ab");
        List<Integer> result2 = actual.findAnagramsStream("ababab", "ab");
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testPatternLongerThanString() {
        List<Integer> result1 = actual.findAnagrams("abc", "abcd");
        List<Integer> result2 = actual.findAnagramsStream("abc", "abcd");
        assertTrue(result1.isEmpty());
        assertTrue(result2.isEmpty());
    }

    @Test
    void testCaseWithDuplicateCharacters() {
        List<Integer> result1 = actual.findAnagrams("baa", "aa");
        List<Integer> result2 = actual.findAnagramsStream("baa", "aa");
        List<Integer> expected = List.of(1);
        assertEquals(expected, result1);
        assertEquals(expected, result2);
    }

    @Test
    void testEmptyInputString() {
        List<Integer> result1 = actual.findAnagrams("", "abc");
        List<Integer> result2 = actual.findAnagrams("", "abc");
        assertTrue(result1.isEmpty());
        assertTrue(result2.isEmpty());
    }

}
