package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNumberOfNiceSubarraysTest {
    CountNumberOfNiceSubarrays actual = new CountNumberOfNiceSubarrays();

    @Test
    public void testExample1() {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;
        assertEquals(2, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testExample2() {
        int[] nums = {2, 4, 6};
        int k = 1;
        assertEquals(0, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testExample3() {
        int[] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        int k = 2;
        assertEquals(16, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testAllOddNumbersSingleK() {
        int[] nums = {1, 3, 5};
        int k = 1;
        assertEquals(3, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testAllOddNumbersFullK() {
        int[] nums = {1, 3, 5, 7};
        int k = 4;
        assertEquals(1, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testKGreaterThanPossible() {
        int[] nums = {1, 2, 3, 4};
        int k = 5;
        assertEquals(0, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testAlternatingNumbers() {
        int[] nums = {1, 2, 3, 4};
        int k = 2;
        assertEquals(2, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testConsecutiveOnes() {
        int[] nums = {1, 1, 1, 1};
        int k = 2;
        assertEquals(3, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testSingleElementValid() {
        int[] nums = {3};
        int k = 1;
        assertEquals(1, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testSingleElementInvalid() {
        int[] nums = {2};
        int k = 1;
        assertEquals(0, actual.numberOfSubarrays(nums, k));
    }

    @Test
    public void testLargeInput() {
        int[] nums = new int[50000];
        // All even
        Arrays.fill(nums, 2);
        int k = 1;
        assertEquals(0, actual.numberOfSubarrays(nums, k));
    }

}
