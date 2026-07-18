class MinStack {
    private Stack<int[]> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(!stack.isEmpty()){
            int min=val;
        min=Math.min(val,stack.peek()[1]);
        stack.push(new int[]{val,min});
        }
        else{
            stack.push(new int[]{val,val});
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek()[0];
        }
    throw new RuntimeException("Stack is empty");
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}
