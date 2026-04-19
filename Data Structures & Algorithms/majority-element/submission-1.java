class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 1;
        int ele = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] == ele){ 
                cnt++;
                if(cnt > nums.length/2) return ele;
            }
            else{
                cnt = 1;
                ele = nums[i];
            }
        }
        return nums[0];
    }
}