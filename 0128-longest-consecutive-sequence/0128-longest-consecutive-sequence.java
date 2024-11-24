class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int len = 1;
        int count = 1;
        for(int i = 1; i < n ; i++){
            if(nums[i - 1]  + 1 == nums[i]){
                count++;
                len = Math.max(count ,len);
           }
           else if(nums[i] == nums[i -1]){
            count = count;
           }
           else{
            count = 1;
           }
        }
        if(n  == 0) return 0;
        else return len;
    }
}