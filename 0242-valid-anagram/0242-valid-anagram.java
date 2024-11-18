class Solution {
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();
        int arr[] = new int[m];
        int arr1[] = new int[n];
        if(n != m) return false;
        for(int i = 0 ; i < m ; i++){
            arr[i] = s.charAt(i) - '0';
        }
        for(int i = 0; i < n ; i++){
            arr1[i] = t.charAt(i) - '0';
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i = 0; i < n ; i++){
            if(arr[i] != arr1[i]){
                return false;
            }
        }
        return true;
        
    }
}