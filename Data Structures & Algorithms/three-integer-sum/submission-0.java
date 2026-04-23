class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int j = i + 1;
            int k = n - 1;
            int tar = -1 * (nums[i]);
            while(j < k){
                int sum = nums[j] + nums[k];
                if(sum == tar){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    if(!ans.contains(temp)) ans.add(temp);
                    j++;
                }
                else if(sum < tar){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
}
