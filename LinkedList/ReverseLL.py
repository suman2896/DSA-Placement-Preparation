# Problem: Reverse Linked List
# Platform: Leetcode
# Link: https://leetcode.com/problems/reverse-linked-list/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(1)

# Code below
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def reverseList(self, head):
        prev = None
        current = head
        while current is not None:
            nextnode = current.next
            current.next = prev
            prev = current
            current = nextnode
        return prev
    

       
        