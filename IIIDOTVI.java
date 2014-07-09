public class Solution {
	public Stack<Integer> sort(Stack<Integer> stack) {
		Stack<Integer> helper = new Stack<Integer>();
		while(!stack.isEmpty()) {
			int n = stack.pop();
			while(!helper.isEmpty() && helper.peek() > n) stack.push(helper.pop());
			helper.push(n);
		}
		return helper;
	}
}
