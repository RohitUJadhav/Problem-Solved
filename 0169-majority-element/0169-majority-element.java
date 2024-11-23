class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int major =  n / 2;
        for(int i = 0 ; i < n ; i++){
            int count = 0;
            for(int j = i ; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > major){
                return nums[i];
            }
        }
        return -1;
    }
}