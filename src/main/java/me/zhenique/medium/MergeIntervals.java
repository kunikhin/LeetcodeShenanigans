package me.zhenique.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import java.util.List;

/*
https://leetcode.com/problems/merge-intervals
 */
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<int[]> intervalsList = new ArrayList<>();
        int[] intervalToAdd = intervals[0];
        intervalsList.add(intervalToAdd);
        for (int[] interval : intervals) {
            if (interval[0] <= intervalToAdd[1]) {
                intervalToAdd[1] = Math.max(intervalToAdd[1], interval[1]);
            } else {
                intervalToAdd = interval;
                intervalsList.add(intervalToAdd);
            }
        }
        return intervalsList.toArray(new int[intervalsList.size()][]);
    }
}
