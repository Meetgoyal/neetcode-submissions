class Solution {
    public int maxProfit(int[] prices) {
      int pro = 0;
      int i = 0;
      int b = -1;
      int s = -1;
      while(i < prices.length - 1){
        if(prices[i] > prices[i + 1]){
            i++;
        }
        else{
            b = i;
            while(i < prices.length - 1 && prices[i] < prices[i + 1]){
                i++;
            }
            s = i;
            pro += (prices[s] - prices[b]);
            i++;
        }
      }  
      return pro;
    }
}