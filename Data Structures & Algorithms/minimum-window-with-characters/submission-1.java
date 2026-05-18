class Solution {
    public String minWindow(String s, String t) {
        int[] f1 = new int[58];
        if(t.length() > s.length()) return "";
        for(int i = 0 ; i < t.length() ; i++){
            f1[t.charAt(i) - 'A']++;
        }
        int i = 0;
        int j = 0;
        String ans = "";
        while(j < s.length()){
            f1[s.charAt(j) - 'A']--;
            if(isTrue(f1)){
                while(isTrue(f1)){
                    f1[s.charAt(i) - 'A']++;
                    i++;
                }
                i--;
                if(ans.equals("") || j - i + 1 < ans.length()){
                    ans = s.substring(i,j + 1);
                }
                i++;
            }
            j++;
        }
        return ans;
    }
    public static boolean isTrue(int[] arr){
        for(int i = 0 ; i < 58 ; i++){
            if(arr[i] > 0) return false;
        }
        return true;
    }
}
