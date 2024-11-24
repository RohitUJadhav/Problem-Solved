class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ls = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count > n / 3) {
                if (ls.size() == 0 || nums[i] != ls.get(0)) {
                    ls.add(nums[i]);
                }
            }
            if (ls.size() == 2) {
                if (ls.get(0) > ls.get(1))
                    java.util.Collections.swap(ls, 0, 1);
                break;
            }
        }
        return ls;
    }
}