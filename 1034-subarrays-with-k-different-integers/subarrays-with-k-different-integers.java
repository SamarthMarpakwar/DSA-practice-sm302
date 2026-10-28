class Solution {

    static int slidingWindow(int[] nums, int k){
        Map<Integer, Integer> mp = new HashMap<>();
        int n = nums.length, i=0, j=0, count = 0;

        while(j<n){
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);

            while(mp.size()>k){
                //shrink the window
                mp.put(nums[i], mp.get(nums[i]) - 1);

                if(mp.get(nums[i]) == 0){
                    mp.remove(nums[i]); ;
                }
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }


    public int subarraysWithKDistinct(int[] nums, int k) {
        return slidingWindow(nums,k) - slidingWindow(nums,k-1);
        
    }
}