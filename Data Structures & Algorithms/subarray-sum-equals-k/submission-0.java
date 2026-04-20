class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> hp = new HashMap<>();
    hp.put(0,1);
    int ans = 0;
    int sum = 0;
    for(int i = 0 ; i < nums.length ; i++){
        sum += nums[i];
        int check = sum - k;
        if(hp.containsKey(check)){
            ans+=hp.get(check);
        }
        hp.put(sum,hp.getOrDefault(sum,0)+1);
    }
    return ans;
    }
}