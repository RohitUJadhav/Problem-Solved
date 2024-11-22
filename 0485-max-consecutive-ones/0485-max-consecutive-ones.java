class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count = 0 ,prev = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1) 
            {
            count++;
            prev = Math.max(count , prev);
            }
            else {
                count =0;
            } 
        }
       return prev;
    }
}