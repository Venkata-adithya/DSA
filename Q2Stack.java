//LC-225

class MyStack {
    Queue<Integer> queue;
    
    public MyStack()
    {
        this.queue=new LinkedList<Integer>();
    }
    
    // Push element x onto stack.
    public void push(int x) 
    {
       queue.add(x);
       for(int i=0;i<queue.size()-1;i++)
       {
           queue.add(queue.poll());
       }
    }

    // Removes the element on top of the stack.
    public int pop() 
    {
        return queue.poll();
    }

    // Get the top element.
    public int top() 
    {
        return queue.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() 
    {
        return queue.isEmpty();
    }
    // Queue<Integer> st = new LinkedList<Integer>();
    // Queue<Integer> temp = new LinkedList<Integer>();
    // int topElement;

    // public MyStack() {
        
    // }

    // public void push(int x) {
    //     st.add(x);
    //     topElement = x;
    // }

    // public int pop() {
    //     while (st.size() > 1) {
    //         topElement = st.remove();
    //         temp.add(topElement);
    //     }
    //     int poppedElement = st.remove();
    //     // Swap the queues
    //     Queue<Integer> swap = st;
    //     st = temp;
    //     temp = swap;
    //     return poppedElement;
    // }

    // public int top() {
    //     return topElement;
    // }

    // public boolean empty() {
    //     return st.isEmpty();
    // }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
