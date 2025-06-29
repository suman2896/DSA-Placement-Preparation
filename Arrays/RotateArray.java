// Problem: Rotate Array
// Platform: Leetcode
// Link: https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // If k > n then adjust it
        reverse(nums, 0, n-1); // reverse entire array
        reverse(nums, 0, k-1); // reverse first k elements
        reverse(nums, k, n-1); // reverse rest of the elements
    }
    private void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}