class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int prev = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if(sum > prev){
                prev = sum;
            }if(sum < 0){
                sum = 0;
            }
         }
        
        return prev;

    }
}