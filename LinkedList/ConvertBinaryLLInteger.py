# Problem: Convert Binary Number in a Linked List to Integer
# Platform: Leetcode
# Link: https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(n)
# Space Complexity: O(n)

# Code below
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        list1=[]
        temp = head
        while temp is not None:
            list1.append(temp.val)
            temp = temp.next
        sum = 0
        for i in list1:
            sum = sum*2+i
        return sum


        
        