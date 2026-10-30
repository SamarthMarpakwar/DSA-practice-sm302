class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        //Solved using Approach 3

        int time = 0, n = tickets.length;

        for(int i=0; i<n; i++){
            if(i<=k){
                time += Math.min(tickets[i], tickets[k]);
            }
            else{
                time += Math.min(tickets[k]-1, tickets[i]);
            }
        }
        return time;
    }
}