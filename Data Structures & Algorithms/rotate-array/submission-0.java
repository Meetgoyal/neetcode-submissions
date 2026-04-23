class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if(k == 0) return;
        int pos = n - k;
        int[] ans = new int[n];
        for(int i = 0 ; i < (n - pos) ; i++){
            ans[i] = nums[i + pos];
        }
        int idx = 0;
        for(int i = (n - pos) ; i < n ; i++){
            ans[i] = nums[idx];
            idx++;
        }
        for(int i = 0 ; i < n ; i++){
            nums[i] = ans[i];
        }
        return;
    }
}