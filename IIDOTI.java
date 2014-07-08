public class Solution {
	public static class ListNode {
		int val;
		ListNode next;
		public ListNode(int val) {
			val = val;
			next = null;
		}
	}
	public void IIDOTI(ListNode head) {
		Set<Integer> set = new HashSet<Integer>();
		ListNode fakeHead = new ListNode(-1);
		fakeHead.next = head;
		ListNode curr = fakeHead;
		while(curr.next != null) {
			int v = curr.next.val;
			if(set.contains(v)) {
				curr.next = curr.next.next;
			}
			curr = curr.next;
		}
	}
}
