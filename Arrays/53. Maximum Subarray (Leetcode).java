class Solution {
    public int maxSubArray(int[] arr) {
        int ans = arr[0];
        int n = arr.length;
        int loc = 0;

        for(int i=0;i<n;i++){
            loc+=arr[i];
            ans = loc>ans?loc:ans;
            if(loc<0){
                loc=0;
            }
        }
        return ans;

    }
}