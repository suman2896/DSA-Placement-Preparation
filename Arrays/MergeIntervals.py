# Problem: Merge Intervals
# Platform: Leetcode
# Link: https://leetcode.com/problems/merge-intervals/description/?envType=study-plan-v2&envId=top-interview-150
# Time Complexity: O(nlogn)
# Space Complexity: O(n)

# Code below
class Solution(object):
    def merge(self, intervals):
        if not intervals:
            return []
        intervals.sort(key=lambda x: x[0]) # sort by start time
        merged = [intervals[0]]
        for current in intervals[1:]:
            prev = merged[-1]
            if current[0] <= prev[1]:
                prev[1] = max(prev[1],current[1])
            else:
                merged.append(current)
        return merged
        