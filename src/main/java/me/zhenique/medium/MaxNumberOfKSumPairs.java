package me.zhenique.medium;

/*
https://leetcode.com/problems/max-number-of-k-sum-pairs/
 */

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public int maxOperations(int[] nums, int k) {
        int answer = 0, right = nums.length - 1, left = 0;
        Arrays.sort(nums);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                answer++;
                left++;
                right--;
            } else if (sum < k)
                left++;
            else
                right--;
        }
        return answer;
    }
}
