package me.zhenique.medium;
/*
https://leetcode.com/problems/continuous-subarray-sum/
 */

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            int remainder = total % k;
            if (!remainderMap.containsKey(remainder)) {
                remainderMap.put(remainder, i);
            } else if (i - remainderMap.get(remainder) > 1) {
                return true;
            }
        }
        return false;
    }
}
