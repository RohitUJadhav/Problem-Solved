class Solution {
    public String intToRoman(int n) {
        StringBuffer bf = new StringBuffer();
        int arbics[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] roman = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        for (int i = 0; i < arbics.length; i++) {
            while (n - arbics[i] >= 0) {
                bf.append(roman[i]);
                n = n - arbics[i];
            }
        }
        return bf.toString();

    }
}