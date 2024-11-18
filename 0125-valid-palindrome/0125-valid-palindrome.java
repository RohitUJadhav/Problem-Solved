class Solution {
    public boolean isPalindrome(String s) {
        String newstr = s.toLowerCase();
        String s1 = new String();
        for(int i = 0; i < newstr.length(); i++){
            if(newstr.charAt(i) >= 'a' && newstr.charAt(i) <= 'z' ||
             newstr.charAt(i) >= '0' && newstr.charAt(i) <= '9'){
                s1 += newstr.charAt(i);
            }
        }
         boolean b = palindrome(s1);
        return b;
    }

    static boolean palindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}