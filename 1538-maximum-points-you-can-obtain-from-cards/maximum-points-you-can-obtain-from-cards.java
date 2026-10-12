class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for(int i=n-k;i<n;i++){
            sum+=cardPoints[i];
        }
        mx = sum;
        for(int i=0;i<k;i++){
            sum = sum + cardPoints[i]-cardPoints[n-k+i];
            mx = Math.max(mx, sum);
        }
        return mx;
    }
}