public class Solution {
	public static class TreeNode {
		public int val;
		public TreeNode left;
		public TreeNode right;
		public TreeNode parent;
		public TreeNode(int v) {
			this.val = v;
			left = null;
			right = null;
			parent = null;
		}
	}
	public TreeNode inorderSucc(TreeNode node) {
		if(node != null) {
			TreeNode parent = node.parent;
			if(parent == null || node.right != null) {
				TreeNode r = node.right;
				while(r.left != null) r = r.left;
				return r;
			} else {
				while(p != null) {
					if(p.left = node) break;
					p = p.parent;
				}
			}
		}
		return p;
	}
}
