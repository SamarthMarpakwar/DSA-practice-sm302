class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int i = 0;
        int j=0;

        int total = 0;
        for (int x : cardPoints) total += x;
        int size = n-k;
        if(size==0) return total;
        int sum = 0;
        int mini = Integer.MAX_VALUE;
       
       
        while(j<n){
            sum+=cardPoints[j];

            if(j-i+1==size){
                mini = Math.min(mini,sum);
                sum-=cardPoints[i++];
            }
            j++;
        }
        return total-mini;
    }
}