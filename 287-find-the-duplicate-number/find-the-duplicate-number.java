class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0], f = nums[0];
        s = nums[s];
        f = nums[nums[f]];
        while(s!=f){ //Detect cycle
            s = nums[s];
            f = nums[nums[f]];
        }
        s = nums[0];
        while(s!=f){ //now moving both slow and fast by one step
            s = nums[s];
            f = nums[f];
        }
        return f;
    }
}