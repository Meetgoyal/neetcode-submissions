class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int n = numbers.length;
        for(int i = 0 ; i < n ; i++){
            int rem = target - numbers[i];
            int idx = bs(numbers,i + 1,n - 1,rem);
            if(idx != -1){
                ans[0] = i + 1;
                ans[1] = idx + 1;
                return ans;
            }
        }   
        return ans;
    }
    public static int bs(int[] arr,int l,int r,int tar){
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == tar) return mid;
            if(arr[mid] < tar) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }
}
