class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0;

        for (int j = k; j < arr.length; j++) {
            if (Math.abs(arr[i] - x) > Math.abs(arr[j] - x)) {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int a = i; a < i + k; a++) {
            ans.add(arr[a]);
        }
        return ans;
    }
}