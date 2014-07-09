public class Solution {
	public TreeNode IVDOTIII(List<Integer> list) {
		
	}
	public TreeNode helper(List<Integer> list, int l, int r) {
		if(l > r) return null;
		int m = (l + r) / 2;
		TreeNode root = new TreeNode(list.get(m));
		root.left = helper(list, l, m - 1);
		root.right = helper(list, m + 1, r);
		return root;
	}
}
