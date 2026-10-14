class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int k) {
        if (k < 0) return 0;

        int i = 0, oddCount = 0, res = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] % 2 == 1) {
                oddCount++;
            }

            while (oddCount > k) {
                if (nums[i] % 2 == 1) {
                    oddCount--;
                }
                i++;
            }

            res += j - i + 1;
        }
        return res;
    }
}