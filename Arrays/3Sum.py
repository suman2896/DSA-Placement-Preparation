# Problem: 3Sum
# Platform: Leetcode
# Link: https://leetcode.com/problems/3sum/description/?envType=study-plan-v2&envId=top-interview-150
# Time Complexity: O(n^2)
# Space Complexity: O(1)

# Code below
class Solution(object):
    def threeSum(self, nums):
        nums.sort()
        res = []
        for i in range(len(nums)-2):
            if i>0 and nums[i] == nums[i-1]:
                continue
            left = i+1
            right = len(nums)-1
            while left < right:
                total = nums[i]+nums[left]+nums[right]
                if total == 0:
                    res.append([nums[i],nums[left],nums[right]])
                    while left < right and nums[left] == nums[left+1]:
                        left = left+1
                    while left < right and nums[right] == nums[right-1]:
                        right = right-1
                    left = left+1
                    right = right-1
                elif total < 0:
                    left = left+1
                else:
                    right = right-1
        return res
