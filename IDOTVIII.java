public class Solution {
	public boolean IDOTVIII(String a, String b) {
		String c = a + a;
		return isSubstring(c, b);
	}
	public boolean isSubstring(String a, String b) {
		int len = b.length();
		int last = Math.min(i+len, a.length());
		for(int i=0;i<a.length();i++) {
			if(b.equals(a.substring(i, i+len))) return true;
		}
		return false;
	}
}
