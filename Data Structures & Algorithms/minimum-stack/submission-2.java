class MinStack {
    Stack<Integer> minStack;
    Stack<Integer> min;

    public MinStack() {
        minStack = new Stack<>();
        min = new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        if(val<=min.peek()){
            min.push(val);
        }
        minStack.push(val);
        
    }
    
    public void pop() {
        if(min.peek().intValue() == minStack.peek().intValue()){
            min.pop();
        }
        minStack.pop();
        
    }
    
    public int top() {
        return minStack.peek();
    }
    
    public int getMin() {
        return min.peek();
        
    }
}
