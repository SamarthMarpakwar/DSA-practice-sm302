class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j=0, zeroCnt = 0, n = nums.length, ans = Integer.MIN_VALUE;
        while(j<n){
            if(nums[j]==0){
                zeroCnt++;
            }
            while(zeroCnt>k){
                if(nums[i]==0){
                    zeroCnt--;
                }
                i++;
            }
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;

    }
}