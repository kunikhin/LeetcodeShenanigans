package me.zhenique.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeIntervalsTest {
    MergeIntervals actual = new MergeIntervals();

    @Test
    void testBasicMerge() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testAdjacentIntervals() {
        int[][] intervals = {{1, 4}, {4, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testNoOverlap() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}};
        int[][] expected = {{1, 2}, {3, 5}, {6, 7}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testEmptyArray() {
        int[][] intervals = {};
        int[][] expected = {};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testSingleInterval() {
        int[][] intervals = {{1, 2}};
        int[][] expected = {{1, 2}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testAllOverlapping() {
        int[][] intervals = {{1, 4}, {1, 3}, {2, 6}};
        int[][] expected = {{1, 6}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testLargeNumbers() {
        int[][] intervals = {{1000000, 2000000}, {1500000, 3000000}};
        int[][] expected = {{1000000, 3000000}};
        assertArrayEquals(expected, actual.merge(intervals));
    }

    @Test
    void testComplexOverlap() {
        int[][] intervals = {{1, 4}, {2, 3}, {3, 5}};
        int[][] expected = {{1, 5}};
        assertArrayEquals(expected, actual.merge(intervals));
    }
}
