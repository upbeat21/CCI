public class Tower {
	Stack<Integer> stack;
	int index;
	public Tower(int i) {
		this.index = i;
		stack = new Stack<Integer>();
	}
	public int index() {
		return index;
	}
	public void add(int n) {
		if(!stack.isEmpty()) {
			if(n >= stack.peek()) System.out.println("Error to put disk " + n + " on Tower " + this.index());
		}
		stack.push(n);
		
	}
	public void moveTopTo(Tower tower) {
		if(stack.isEmpty()) System.out.println("Error to put top of Tower " + this.index() + " on Tower " + tower.index());
		tower.add(stack.pop());
		System.out.println("Successfully put top of Tower " + this.index() + " on Tower " + tower.index());
	}
	public void moveDisks(int n, Tower destination, Tower buffer) {
		if(n > 0) {
			moveDisks(n-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
}
