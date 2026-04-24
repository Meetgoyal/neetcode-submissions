class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int n = people.length;
        int r = n - 1;
        int ans = 0;
        while(l <= r){
            if(people[r] + people[l] > limit){
                ans++;
                r--;
            }
            else{
                ans++;
                l++;
                r--;
            }
        }
        return ans;
    }
}