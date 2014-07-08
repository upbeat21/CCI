public class StackWithMin {
	Stack<Integer> stack;
	Stack<Integer> min;
	public StackWithMin() {
		stack = new Stack<Integer>();
		min = new Stack<integer>();
	}
	public isEmpty() {
		return stack.isEmpty();
	}
	public void push(int n) {
		if(n <= min.peek()) {
			min.push(n);
		}
		stack.push(n);
	}	
	public int peek() {
		return stack.peek();
	}
	public int pop() {
		int n = stack.pop();
		if(n == min.peek()) min.pop();
		return n;
	}
	public int min() {
		return min.peek();
	}
}
