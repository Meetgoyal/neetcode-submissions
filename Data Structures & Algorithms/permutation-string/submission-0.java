class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int[] f1 = new int[26];
        for(int i = 0 ; i < s1.length() ; i++){
            f1[s1.charAt(i) - 'a']++;
        }
        int[] f2 = new int[26];
        int i = 0 ;
        int  j = 0;
        while(j < s2.length()){
            f2[s2.charAt(j) - 'a']++;
            if(j - i >= s1.length()){
                f2[s2.charAt(i) - 'a']--;
                i++;
            }
            if((j - i + 1) == s1.length()){
                if(check(f1,f2))return true;
            }
            j++;
        }
        return false;
    }
    public static boolean check(int[] f1,int[] f2){
        for(int i = 0 ;i < 26 ; i++){
            if(f1[i] != f2[i]) return false;
        }
        return true;
    }
}
