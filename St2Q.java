//LC-232

class MyQueue {
    Stack<Integer> input = new Stack();
    Stack<Integer> output = new Stack();
    
    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty())
            while (!input.empty())
                output.push(input.pop());
        return output.peek();
    }
    public boolean empty() {
        return input.empty() && output.empty();
    }
    // Stack<Integer> stack = new Stack<Integer>();
    // public MyQueue() {
        
    // }
    
    // public void push(int x) {
    //     stack.add(x);
    // }
    
    // public int pop() {
    //     return stack.remove(0);
    // }
    
    // public int peek() {
    //     return stack.get(0);
    // }
    
    // public boolean empty() {
    //     return stack.isEmpty();
    // }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
