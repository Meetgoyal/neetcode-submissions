class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = -1;
        int sell = -1;
        for(int i = prices.length - 1 ; i >= 0 ; i--){
            if(sell == -1){
                sell = prices[i];
            }
            else if(prices[i] > sell){
                buy = prices[i];
                sell = prices[i];
            }
            else{
                buy = prices[i];
                max = Math.max(max,sell - buy);
            }
        }
        return max;
    }
}
