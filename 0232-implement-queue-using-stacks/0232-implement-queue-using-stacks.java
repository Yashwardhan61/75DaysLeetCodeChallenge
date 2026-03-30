class MyQueue {
    Stack<Integer> stack11;
    Stack<Integer> stack2;

    public MyQueue() {
        stack11 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack11.push(x);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack11.isEmpty()) {
                stack2.push(stack11.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack11.isEmpty()) {
                stack2.push(stack11.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack11.isEmpty() && stack2.isEmpty();
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