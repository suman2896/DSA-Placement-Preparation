# Problem: Palindrome Linked List
# Platform: Leetcode
# Link: https://leetcode.com/problems/palindrome-linked-list/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(n)

# Code below
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def isPalindrome(self, head):
        list1 = []
        list2 = []
        temp = head
        while temp is not None:
            list1.append(temp.val)
            temp = temp.next
        for i in range(len(list1)-1,-1,-1):
            list2.append(list1[i])
        if list1==list2:
            return True
        else:
            return False
        
        