// Problem: Best Time to Buy and Sell Stock
// Platform: Leetcode
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=study-plan-v2&envId=top-interview-150
// Time Complexity: O(n)
// Space Complexity: O(1)

// Code below
class Solution {
    public int maxProfit(int[] prices) {
       int min_profit = Integer.MAX_VALUE;
       int max_profit = 0;
       for(int price : prices){
        min_profit = Math.min(min_profit, price);
        max_profit = Math.max(max_profit, price-min_profit);
       }
       return max_profit;
    }
}