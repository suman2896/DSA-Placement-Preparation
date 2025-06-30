// Problem: H-Index
// Platform: Leetcode
// Link: https://leetcode.com/problems/h-index/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(nlogn)
// Space Complexity: O(1)

// Code below
import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        for (int i=0;i<n;i++){
            int h = n-i;
            if (citations[i]>=h){
                return h;
            }
        }
        return 0;
    }
}