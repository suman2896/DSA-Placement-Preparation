# Problem: Merge Two Sorted Lists
# Platform: Leetcode
# Link: https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=problem-list-v2&envId=linked-list
# Time Complexity: O(m+n)
# Space Complexity: O(1)

# Code below
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        if list1 is None:
            return list2
        if list2 is None:
            return list1
        finalhead = finaltail = None
        while list1 is not None and list2 is not None:
            if list1.val<list2.val:
                if finalhead==None:
                    finalhead = list1
                    finaltail = list1
                else:
                    finaltail.next = list1
                    finaltail = list1
                list1 = list1.next
            else:
                if finalhead==None:
                    finalhead = list2
                    finaltail = list2
                else:
                    finaltail.next = list2
                    finaltail = list2
                list2 = list2.next
        if list1 is not None:
            finaltail.next = list1
        if list2 is not None:
            finaltail.next = list2
        return finalhead

        
        