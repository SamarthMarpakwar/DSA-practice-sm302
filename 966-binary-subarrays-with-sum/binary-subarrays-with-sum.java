class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length, currSum = 0, result = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        for(int num:nums){
            currSum+=num;
            int remainingSum = currSum-goal;
            result += mp.getOrDefault(remainingSum, 0);
            mp.put(currSum, mp.getOrDefault(currSum, 0)+1);
        }
        return result;
    }
}