class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")) return 1;
        int[] freq = new int[95];
        int i = 0;
        int j = 0;
        int ans = 0;
        while(j < s.length()){
            char ch = s.charAt(j);
            freq[ch - ' ']++;
            if(freq[ch - ' '] > 1){
                while(freq[ch - ' '] > 1){
                    freq[s.charAt(i) - ' ']--;
                    i++;
                }
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
