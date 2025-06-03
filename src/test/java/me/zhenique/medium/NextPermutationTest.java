package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextPermutationTest {
    NextPermutation actual = new NextPermutation();

    @Test
    void baseCase() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 3, 2};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void resetToAscending() {
        int[] nums = {3, 2, 1};
        int[] expected = {1, 2, 3};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void dublicates1() {
        int[] nums = {1, 1, 5};
        int[] expected = {1, 5, 1};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void oneElement() {
        int[] nums = {1};
        int[] expected = {1};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void moveTwoElements() {
        int[] nums = {1, 3, 2};
        int[] expected = {2, 1, 3};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void dublicates2() {
        int[] nums = {1, 5, 1};
        int[] expected = {5, 1, 1};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void twoElements() {
        int[] nums = {1, 2};
        int[] expected = {2, 1};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void complexCase() {
        int[] nums = {0, 1, 2, 5, 3, 3, 0};
        int[] expected = {0, 1, 3, 0, 2, 3, 5};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void partialSwap() {
        int[] nums = {1, 3, 2, 4};
        int[] expected = {1, 3, 4, 2};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    void swapHead() {
        int[] nums = {2, 3, 1};
        int[] expected = {3, 1, 2};
        actual.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}
