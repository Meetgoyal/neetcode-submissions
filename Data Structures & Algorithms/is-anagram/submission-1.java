class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hp1 = new HashMap<>();
        HashMap<Character,Integer> hp2 = new HashMap<>();
        
        if(s.length() != t.length()) return false;

        for(int i = 0 ; i < s.length() ; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            hp1.put(c1,hp1.getOrDefault(c1,0) + 1);
            hp2.put(c2,hp2.getOrDefault(c2,0) + 1);
        }
        for(Character ch : hp1.keySet()){
            if(!hp2.containsKey(ch)) return false;
            if(!hp2.get(ch).equals(hp1.get(ch))) return false;
        }
        return true;
    }
}
