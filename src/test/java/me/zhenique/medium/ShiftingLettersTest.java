package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShiftingLettersTest {
    ShiftingLetters actual = new ShiftingLetters();

    @Test
    void testExample1() {
        String s = "abc";
        int[] shifts = {3, 5, 9};
        String expected = "rpl";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testExample2() {
        String s = "aaa";
        int[] shifts = {1, 2, 3};
        String expected = "gfd";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testEmptyString() {
        String s = "";
        int[] shifts = {};
        String expected = "";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testZeroShifts() {
        String s = "abc";
        int[] shifts = {0, 0, 0};
        String expected = "abc";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testSingleCharacter() {
        String s = "z";
        int[] shifts = {1};
        String expected = "a";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testLargeShifts() {
        String s = "abc";
        int[] shifts = {26, 52, 78};
        // Shifts equivalent to 0 (26%26=0, 52%26=0, etc.)
        // String should remain unchanged
        String expected = "abc";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testWrapAround() {
        String s = "z";
        int[] shifts = {27};
        // 27 % 26 = 1 -> 'z' shifted by 1: 25+1=26 -> 0 ('a')
        String expected = "a";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testMixedShifts() {
        String s = "xyz";
        int[] shifts = {1, 2, 3};
        // Character 0 ('x'): shift = 1+2+3=6 -> 23+6=29 %26=3 -> 'd'
        // Character 1 ('y'): shift = 5 (6-1=5) -> 24+5=29 %26=3 -> 'd'
        // Character 2 ('z'): shift = 3 (5-2=3) -> 25+3=28 %26=2 -> 'c'
        String expected = "ddc";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testVeryLargeShifts() {
        String s = "a";
        int[] shifts = {1000000000};
        // 1000000000 % 26 = 12 (since 26*38461538=999999988, remainder 12)
        // 'a' (0) + 12 = 12 -> 'm'
        String expected = "m";
        assertEquals(expected, actual.shiftingLetters(s, shifts));
    }

    @Test
    void testNegativeModuleHandling() {
        String s = "ab";
        int [] shifts = new int[]{15, 10};
        // Total initial shift = (15+10)%26 = 25
        // Character 0: 'a' + 25 = 'z'
        // Update shift: floorMod(25-15, 26) = 10
        // Character 1: 'b' (1) + 10 = 11 -> 'l'
        assertEquals("zl", actual.shiftingLetters(s, shifts));
    }
}

