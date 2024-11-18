class Solution {
    public boolean isHappy(int n) {
        int result = n;
        while(result != 1 && result != 4){
            result = Happy(result);
        }
        if(result == 1){
            return true;
        }
        else if(result == 4){
            return false;
        }
        return false; 
    }
    static int Happy(int n){
        int sum = 0;
        while(n != 0){
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}