// Problem: Plus One
// Platform: Leetcode
// Link: https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int c = 0;
        for(int num : nums){
            if(count==0){
                c=num;
            }
            count += (num==c) ? 1 : -1;
        }
        return c;
    }
}