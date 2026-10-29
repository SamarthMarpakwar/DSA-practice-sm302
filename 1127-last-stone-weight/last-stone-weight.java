class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for (int s : stones) {
            maxHeap.add(s);
        }

        while (maxHeap.size() > 1) {
            int y = maxHeap.poll();   // sabse bhaari
            int x = maxHeap.poll();   // doosra sabse bhaari
            if (y != x) {
                maxHeap.add(y - x);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}