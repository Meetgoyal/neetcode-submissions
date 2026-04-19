class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp = new HashMap<>();
        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String t = new String(temp);
            if(hp.containsKey(t)){
                hp.get(t).add(s);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(s);
                hp.put(t,l);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : hp.keySet()){
            ans.add(hp.get(key));
        }
        return ans;
    }
}
