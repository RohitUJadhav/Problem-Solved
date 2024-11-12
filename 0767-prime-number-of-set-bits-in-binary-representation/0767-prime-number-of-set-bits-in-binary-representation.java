class Solution {
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                cnt++;
            }
        }
        return cnt;
    }
    public static boolean isPrime(int i){
        int bin =0, base = 1, count = 0;
        while(i != 0){
            int rem = i % 2;
            if(rem == 1){
                count++;
            }
            bin += rem * base;
            base *= 10;
            i /= 2;
        }
        int cnt = 0;
        for(int k = 1 ; k <= count ; k++){
            if(count % k == 0){
                cnt++;
            }
        }
       if(cnt == 2){
        return true;
       }
       else{
        return false;
       }
    }
}