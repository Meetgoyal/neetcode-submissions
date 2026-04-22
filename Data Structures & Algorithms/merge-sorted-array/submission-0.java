class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n ; i++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
    public static int binarySearch(int[] arr,int tar,int m){
        int l = 0;
        int r = arr.length - m;
        while(l <= r){
            int mid = l + (r - l)/2;
            if(arr[mid] == tar)return mid;
            if(arr[mid] < tar){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }
        return l;
    }
}