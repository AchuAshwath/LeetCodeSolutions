import java.util.Stack; 

public class solution {
    class MinStack {
        int minElement; 
        Stack<Integer> minStack;
        public MinStack() {
            minStack = new Stack<>();
        }
        
        public void push(int val) { 
            if(minStack.empty()){
                minElement = val;
            }else if(minElement > val){
                minElement = val;
            }
            minStack.push(val);
        }
        
        public void pop() {
            minStack.pop();
            if(!minStack.empty()){
                minElement = minStack.peek();
            }
            for(Integer element: minStack){
                if(element < minElement){
                    minElement = element;
                }
            }
        }
        
        public int top() {
            return minStack.peek();
        }
        
        public int getMin() {
            return minElement;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
