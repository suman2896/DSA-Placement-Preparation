# Problem: Middle of the Linked List
# Platform: Leetcode
# Link: https://leetcode.com/problems/middle-of-the-linked-list/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(1)

# Code below
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def middleNode(self, head):
        start = head
        end = head
        while end and end.next:
            start = start.next
            end = end.next.next
        return start
      
        