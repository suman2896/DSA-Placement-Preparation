# Problem: Two Sum
# Platform: Leetcode
# Link: https://leetcode.com/problems/two-sum/description/?envType=study-plan-v2&envId=top-interview-150
# Time Complexity: O(n^2)
# Space Complexity: O(1)

# Code below
class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j] == target:
                    return [i,j]
        