public class Solution {
	public boolean isSubTree(TreeNode r1, TreeNode r2) {
		if(r1 == null && r2 == null) return true;
		if(r1 == null || r2 == null) return false;
		if(r1 == r2) return (isSubTree(r1.left, r2.left) && isSubTree(r1.right, r2.right)) || isSubTree(r1.left, r2) || isSubTree(r1.right, r2);
		else return isSubTree(r1.left, r2) || isSubTree(r1.right, r2);
	}
}
