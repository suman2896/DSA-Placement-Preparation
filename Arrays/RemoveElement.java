// Problem: Remove Element
// Platform: Leetcode
// Link: https://leetcode.com/problems/remove-element/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class RemoveElement {
    public int removeElement(int[] nums, int val) {
       int count = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
            nums[count] = nums[i];
            count++;
        }
       }
       return count; 
    }
}