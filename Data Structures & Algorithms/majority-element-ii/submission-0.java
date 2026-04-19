class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            hp.put(i,hp.getOrDefault(i,0) + 1);
        }
        for(int i : hp.keySet()){
            if(hp.get(i) > n/3){
                ans.add(i);
            }
        }
        return ans;
    }
}