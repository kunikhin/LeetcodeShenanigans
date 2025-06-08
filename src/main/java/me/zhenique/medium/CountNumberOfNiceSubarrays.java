package me.zhenique.medium;
/*
https://leetcode.com/problems/count-number-of-nice-subarrays
 */
public class CountNumberOfNiceSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int left = 0, middle = 0, answer = 0, oddNums = 0;
        for (int right = 0; right < nums.length; right++) {
            if ((nums[right] & 1) != 0) oddNums++;
            while (oddNums > k) {
                if ((nums[left] & 1) != 0) oddNums--;
                left++;
                middle = left;
            }
            if (oddNums == k) {
                while ((nums[middle] & 1) == 0) middle++;
                answer += (middle - left) + 1;
            }
        }
        return answer;
    }
}
