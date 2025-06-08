package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberOfKSumPairsTest {
    MaxNumberOfKSumPairs actual = new MaxNumberOfKSumPairs();
    @Test
    public void testExample1() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        int expected = 2;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testExample2() {
        int[] nums = {3, 1, 3, 4, 3};
        int k = 6;
        int expected = 1;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testNoPairs() {
        int[] nums = {1, 2, 3, 4};
        int k = 10;
        int expected = 0;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testAllPairsWithSameNumber() {
        int[] nums = {5, 5, 5, 5, 5, 5};
        int k = 10;
        int expected = 3;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {7};
        int k = 7;
        int expected = 0;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int k = 5;
        int expected = 0;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, 3, 6, 8};
        int k = 5;
        int expected = 1;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testMixedNumbers() {
        int[] nums = {2, 2, 3, 1, 1, 4, 0, 5};
        int k = 4;
        int expected = 3;
        assertEquals(expected, actual.maxOperations(nums, k));
    }

    @Test
    public void testDuplicateNumbersWithMultiplePairs() {
        int[] nums = {1, 3, 1, 3, 1, 3, 3};
        int k = 4;
        int expected = 3;
        assertEquals(expected, actual.maxOperations(nums, k));
    }
}
