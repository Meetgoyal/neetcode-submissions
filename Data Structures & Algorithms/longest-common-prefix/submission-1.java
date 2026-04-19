class Solution {
    public String longestCommonPrefix(String[] strs) {
        String check = strs[0];
        String ans = "";
        for(int i = 0 ; i < check.length() ; i++){
            String sub = check.substring(0,i + 1);
            if(!checkAll(sub,strs)){
                break;
            }
            ans = sub;
        }
        return ans;
    }
    public static boolean checkAll(String s,String[] strs){
        int l = s.length();
        for(int i = 1; i < strs.length ; i++){
            String t = strs[i];
            if(t.length() < l) return false;
            String sub = t.substring(0,l);
            if(!sub.equals(s)) return false;
        }
        return true;
    }
}