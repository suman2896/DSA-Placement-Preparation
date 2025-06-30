# Problem: Product of Array Except Self
# Platform: Leetcode
# Link: https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150
# Time Complexity: O(n)
# Space Complexity: O(1)

# Code below
class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n
        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix = prefix*nums[i]
        suffix = 1
        for j in reversed(range(n)):
            result[j] = result[j]*suffix
            suffix = suffix*nums[j]
        return result
        