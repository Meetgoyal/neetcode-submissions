class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int i = 0 ;
        int j = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(j < n){
            pq.offer(nums[j]);
            if((j - i + 1) >= k){
                ans[i] = pq.peek();
                pq.remove(nums[i]);
                i++;

            }
            j++;
        }
        return ans;
    }
}
