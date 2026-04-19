class Solution {
    public class data{
        int num;
        int freq;
        public data(int n,int f){
            num = n;
            freq = f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            hp.put(nums[i],hp.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<data> pq = new PriorityQueue<>((a,b) -> a.freq - b.freq);
        for(int key : hp.keySet()){
            data temp = new data(key,hp.get(key));
            pq.add(temp);
            if(pq.size() > k){
                pq.remove();
            }
        }
        int[] ans = new int[k];
        int idx = 0;
        while(pq.size() > 0){
            ans[idx] = pq.remove().num;
            idx++;
        }
        return ans;
    }
}