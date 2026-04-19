class Solution {
    
    public String encode(List<String> strs) {
        StringBuilder st = new StringBuilder();
        for(String s : strs){
            st.append(s.length());
            st.append("#");
            st.append(s);
        }
        return st.toString();
    }

    public List<String> decode(String str) {
        System.out.println(str);
        List<String> ans = new ArrayList<>();
        int i = 0;
        String s = "";
        int len = 0;
        while(i < str.length()){
            String temp = "";
            while(str.charAt(i) != '#'){
                temp += str.charAt(i);
                i++;
            }
            len = Integer.parseInt(temp);
            System.out.println(len);
            for(int j = 0 ; j < len ; j++){
                i++;
                s += str.charAt(i);
            }
            ans.add(s);
            s = "";
            i++;
        }
        return ans;
    }
}
