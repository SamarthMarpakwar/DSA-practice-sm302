class MyQueue {

    Stack<Integer> inputStack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();
    int peekEl = -1;


    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(inputStack.isEmpty()){
            peekEl = x;
        }
        inputStack.push(x);
        //amortized O(1)
    }
    
    public int pop() {
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.pop();
    }
    
    public int peek() {
        if(outputStack.empty()){
            return peekEl;
        }
        return outputStack.peek();
    }
    
    public boolean empty() {
        if(inputStack.isEmpty() && outputStack.isEmpty()){
            return true;
        }
        return false;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */