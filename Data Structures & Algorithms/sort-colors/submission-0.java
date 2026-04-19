class Solution {
    public void sortColors(int[] nums) {
        int rc = 0, wc = 0, bc = 0;
        for(int i : nums){
            if(i == 0) rc++;
            else if(i == 1)wc++;
            else bc++;
        }
        int i = 0;
        while(i < nums.length){
            while(rc > 0){
                nums[i++] = 0;
                rc--;
            }
            while(wc >0){
                nums[i++] = 1;
                wc--;
            }
            while(bc > 0){
                nums[i++] = 2;
                bc--;
            }
        }
    }
}