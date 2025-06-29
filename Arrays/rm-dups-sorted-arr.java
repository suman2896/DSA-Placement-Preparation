// Problem: Remove Duplicates from Sorted Array
// Platform: Leetcode
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[k]!=nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }
}