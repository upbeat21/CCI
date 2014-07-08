public class SetOfStacks {
	List<Stack<Integer>> list;
	int threshold;
	int num;
	public SetOfStacks(int threshold) {
		this.threshold = threshold;
		list = new ArrayList<Stack<Integer>>();
		this.num = 0;
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public void push(int n) {
		if(num == 0) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(n);
			list.add(stack);
			return;
		}
		Stack<Integer> stack = list.get(num);
		if(stack.size() < threshold) {
			stack.push(n);
		} else {
			Stack<Integer> newStack = new Stack<Integer>();
			newStack.push(n);
			list.add(newStack);
			num++;
		}
	}
	public int peek() {
		return list.get(num).peek();
	}
	public int pop() {
		Stack<Integer> stack = list.get(num);
		int n = stack.pop();
		if(stack.isEmpty()) {
			list.remove(num);
			num--;
		}
		return n;
	}
	
}
