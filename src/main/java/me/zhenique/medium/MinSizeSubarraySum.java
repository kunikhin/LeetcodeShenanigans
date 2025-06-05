package me.zhenique.medium;

/*
https://leetcode.com/problems/minimum-size-subarray-sum
 */
public class MinSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int windowSize = Integer.MAX_VALUE, currentSum = 0, slowIndex = 0, fastIndex = 0;
        while (fastIndex < nums.length) {
            currentSum += nums[fastIndex];
            fastIndex++;
            while (currentSum >= target) {
                windowSize = Math.min(windowSize, fastIndex - slowIndex);
                currentSum -= nums[slowIndex];
                slowIndex++;
            }
        }
        return windowSize == Integer.MAX_VALUE ? 0 : windowSize;
    }
}
