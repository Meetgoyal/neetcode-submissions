class Solution {
    public int[] sortArray(int[] nums) {
        //merge sort
        mergeSort(nums,0,nums.length - 1);
        return nums;
    }
    public static void mergeSort(int[] arr,int l,int r){
        if(l < r){
            int mid = (l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,r,mid);
        }
    }
    public static void merge(int[] arr,int l,int r,int mid){
        int[] la = new int[mid - l + 1];
        int[] ra = new int[r - mid];
        for(int i = 0 ; i < la.length ; i++){
            la[i] = arr[i + l];
        }
        for(int i = 0 ; i < ra.length ; i++){
            ra[i] = arr[mid + i + 1];
        }
        int idx = l;
        int i = 0;
        int j = 0;
        while(i < la.length && j < ra.length){
            if(la[i] < ra[j]){
                arr[idx] = la[i];
                i++;
            }
            else{
                arr[idx] = ra[j];
                j++;
            }
            idx++;
        }
        while(i < la.length) arr[idx++] = la[i++];
        while( j < ra.length) arr[idx++] = ra[j++];
    }
}