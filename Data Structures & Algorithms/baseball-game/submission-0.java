class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String op : operations){
            if(op.equals("+")){
                int a1 = st.pop();
                int a2= st.pop();
                int sum = a1+ a2;
                st.push(a2) ; st.push(a1) ; st.push(sum);
            }
            else if(op.equals("D")){
                int dob = st.peek() * 2;
                st.push(dob);
            }
            else if(op.equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(st.size() > 0) sum += st.pop();
        return sum;
    }
}