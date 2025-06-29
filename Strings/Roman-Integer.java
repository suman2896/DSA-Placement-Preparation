// Problem: Roman to Integer
// Platform: Leetcode
// Link: https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    public int romanToInt(String s) {
        int r = 0;
        for(int i=0;i<s.length();i++){
            int cval = getValue(s.charAt(i));
            if(i<s.length()-1 && cval<getValue(s.charAt(i+1))){
                r-=cval;
            }
            else{
                r+=cval;
            }
        }
        return r;
    }
    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    } 
}