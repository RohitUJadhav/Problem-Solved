class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = 1;
        while(i < n){
            if(nums[i] < nums[ i -1] ){
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                i = 1;
            }
            else{
               i++;
            }
        }
        
    }
}