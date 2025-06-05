package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinSizeSubarraySumTest {

    MinSizeSubarraySum actual = new MinSizeSubarraySum();

    @Test
    void testNormalCase() {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        assertEquals(2, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testEntireArrayIsSolution() {
        int[] nums = {1, 4, 4};
        int target = 9;
        assertEquals(3, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testSolutionAtStart() {
        int[] nums = {10, 2, 3, 1, 1, 1};
        int target = 10;
        assertEquals(1, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testSolutionAtEnd() {
        int[] nums = {1, 1, 1, 7};
        int target = 7;
        assertEquals(1, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testNoValidSubarray() {
        int[] nums = {1, 2, 3};
        int target = 10;
        assertEquals(0, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testSingleElementValid() {
        int[] nums = {5};
        int target = 4;
        assertEquals(1, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testSingleElementInvalid() {
        int[] nums = {3};
        int target = 4;
        assertEquals(0, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testOverlappingSolutions() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int target = 20;
        assertEquals(4, actual.minSubArrayLen(target, nums));
    }


    @Test
    void testLargeNumbers() {
        int[] nums = {100, 50, 25, 75};
        int target = 150;
        assertEquals(2, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testMinimumPossibleLength() {
        int[] nums = {10, 1, 1, 1, 1, 1, 1, 1, 1};
        int target = 10;
        assertEquals(1, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testMultipleSameElements() {
        int[] nums = {1, 1, 1, 1, 7};
        int target = 7;
        assertEquals(1, actual.minSubArrayLen(target, nums));
    }

    @Test
    void testEmptyArray() {
        int[] nums = {};
        int target = 1;
        assertEquals(0, actual.minSubArrayLen(target, nums));
    }

    @Test
    void leetCodeFailed() {
        int[] nums = {12, 28, 83, 4, 25, 26, 25, 2, 25, 25, 25, 12};
        int target = 213;
        assertEquals(8, actual.minSubArrayLen(target, nums));
    }
}
