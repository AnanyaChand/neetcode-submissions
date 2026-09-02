class Solution {
    public int maxProfit(int[] prices) {
        //int profit=0;
        int max_Profit=0;
         int minPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            int profit=prices[i]-minPrice;
            max_Profit=Math.max(profit,max_Profit);
            minPrice=Math.min(minPrice,prices[i]);
            
        }
        
        return max_Profit;
    }
}
