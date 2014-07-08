public class Solution {
	public static class ListNode {
		int val;
		ListNode next;
		public ListNode(int val) {
			val = val;
			next = null;
		}
	}
	public ListNode IIDOTII(ListNode head, int n) {
		if(head == null) return null;
		ListNode slow = head;
		ListNode fast = head;
		for(int i=0;i<n;i++) {
			fast = fast.next;
			if(fast == null) return null;
		}
		while(fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	
}
