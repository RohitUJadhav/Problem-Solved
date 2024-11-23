class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int sell = 0;
        for(int i = 0 ; i < n ; i++){
            int profit = prices[i] - buy;
            sell = Math.max(profit, sell);
            buy = Math.min(buy , prices[i]);

        } 
        
        return sell;
    }
}