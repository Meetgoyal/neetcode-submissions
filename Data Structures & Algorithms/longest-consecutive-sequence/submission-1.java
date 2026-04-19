class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            hs.add(i);
        }
        int ans = 0;
        for(int i : nums){
            if(!hs.contains(i - 1)){
                int cnt = 1;
                while(hs.contains(i + 1)){
                    cnt++;
                    i++;
                }
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
