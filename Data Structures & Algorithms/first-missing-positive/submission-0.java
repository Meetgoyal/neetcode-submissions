class Solution {
    public int firstMissingPositive(int[] nums) {
        // hum kya krenge for all negative and zeroes to negelect them unko 1 se mark krdenge/make sure ti check 1 present h ki nhi vrna vahi answer hoga then for each number agr vo present h arr me toh usko negaive mark krdenge uske index pe
        boolean contains1 = false;
        int n = nums.length;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1) contains1 = true;
            if(nums[i] < 0 || nums[i] == 0 || nums[i] > n){
                nums[i] = 1;
            }
        }
        if(!contains1) return 1;
        for(int i = 0 ; i < nums.length ; i++){
            int val = Math.abs(nums[i]);
            //val present h so usko mark krne ke liye just make val index of arr negative
            if(val == n) nums[0] = -Math.abs(nums[0]);
            else nums[val] = -Math.abs(nums[val]);
        }
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > 0) return i;
        }
        if(nums[0] > 0)return n;
        //1-n thk sab present h n + 1 smallest h
        return n + 1;
    }
}