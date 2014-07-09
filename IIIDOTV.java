public class MyQueue {
	Stack<T> s1;
	Stack<T> s2;
	public MyQueue() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	public void add(T t) {
		s1.push(t);
	}
	public boolean isEmpty() {
		return s1.isEmpty() && s2.isEmpty();
	}
	public T peek() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		if(!s2.isEmpty()) return s2.peek();
		return null;
	}
	public int remove() {
		while(!s2.isEmpty()) {
			s2.push(s1.pop());
		}
		if(!s2.isEmpty()) return s2.pop();
		return null;
	}
}
