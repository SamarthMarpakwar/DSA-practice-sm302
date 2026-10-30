class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(int s: stones){
            maxHeap.add(s);
        }

        while(maxHeap.size()>1){
            int a = maxHeap.poll(); //highest value element
            int b = maxHeap.poll(); //second highest value element in the heap
            
            maxHeap.add(a-b);
        }
        return maxHeap.peek();
    }
}