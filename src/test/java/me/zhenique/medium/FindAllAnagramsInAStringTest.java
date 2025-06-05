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
        List<Integer> result = actual.findAnagrams("cbaebabacd", "abc");
        List<Integer> expected = Arrays.asList(0, 6);
        assertEquals(expected, result);
    }

    @Test
    void testExample2() {
        List<Integer> result = actual.findAnagrams("abab", "ab");
        List<Integer> expected = Arrays.asList(0, 1, 2);
        assertEquals(expected, result);
    }

    @Test
    void testNoAnagramsFound() {
        List<Integer> result = actual.findAnagrams("abcdefg", "xyz");
        assertTrue(result.isEmpty());
    }

    @Test
    void testSingleCharacterPattern() {
        List<Integer> result = actual.findAnagrams("banana", "a");
        List<Integer> expected = Arrays.asList(1, 3, 5);
        assertEquals(expected, result);
    }

    @Test
    void testFullStringIsAnagram() {
        List<Integer> result = actual.findAnagrams("listen", "silent");
        List<Integer> expected = List.of(0);
        assertEquals(expected, result);
    }

    @Test
    void testOverlappingAnagrams() {
        List<Integer> result = actual.findAnagrams("ababab", "ab");
        List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4);
        assertEquals(expected, result);
    }

    @Test
    void testPatternLongerThanString() {
        List<Integer> result = actual.findAnagrams("abc", "abcd");
        assertTrue(result.isEmpty());
    }

    @Test
    void testCaseWithDuplicateCharacters() {
        List<Integer> result = actual.findAnagrams("baa", "aa");
        List<Integer> expected = List.of(1);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyInputString() {
        List<Integer> result = actual.findAnagrams("", "abc");
        assertTrue(result.isEmpty());
    }

}
