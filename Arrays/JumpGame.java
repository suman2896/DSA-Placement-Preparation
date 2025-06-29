// Problem: Jump Game
// Platform: Leetcode
// Link: https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class JumpGame {
    public boolean canJump(int[] nums) {
       int goal = nums.length-1;
       for(int i=nums.length-2; i>=0; i--){
        if(i + nums[i] >= goal){
            goal = i;
        }
       }
       return goal==0; 
    }
}