package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContinuousSubarraySumTest {
    ContinuousSubarraySum actual = new ContinuousSubarraySum();

    @Test
    void testExample1() {
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testExample2() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 6;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testExample3() {
        int[] nums = {23, 2, 6, 4, 7};
        int k = 13;
        assertFalse(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testDoubleZero() {
        int[] nums = {0, 0};
        int k = 1;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testTripleZero() {
        int[] nums = {0, 0, 0};
        int k = 1;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testZeroAtBeginningValid() {
        int[] nums = {0, 1, 2, 3};
        int k = 3;
        assertTrue(actual.checkSubarraySum(nums, k));
    }


    @Test
    void testSubarraySumMultipleOfK() {
        int[] nums = {5, 0, 0, 0};
        int k = 3;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testSingleElement() {
        int[] nums = {1};
        int k = 1;
        assertFalse(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testTwoElementsValid() {
        int[] nums = {2, 4};
        int k = 6;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testTwoElementsInvalid() {
        int[] nums = {2, 5};
        int k = 6;
        assertFalse(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testLargeK() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 15;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testZerosInMiddle() {
        int[] nums = {1, 3, 0, 0};
        int k = 4;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testConsecutiveZeros() {
        int[] nums = {3, 0, 0};
        int k = 3;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testNonConsecutiveZeros() {
        int[] nums = {0, 1, 0};
        int k = 2;
        assertFalse(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testMultipleZerosValid() {
        int[] nums = {0, 0, 1, 0};
        int k = 2;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testSumZeroWithPositiveK() {
        int[] nums = {1, -1, 2, -2};
        int k = 5;
        assertTrue(actual.checkSubarraySum(nums, k));
    }

    @Test
    void testLargeNumbers() {
        int[] nums = {1000000000, 1000000000};
        int k = 1000000000;
        assertTrue(actual.checkSubarraySum(nums, k));
    }
}
