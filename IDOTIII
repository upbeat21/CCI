public class Solution {
	public String IDOTIII(String s) {
		if(s == null || s.length() == 0) return s;
		int n = 0;
		String t = s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			int m = s.charAt(i) - 'a';
			int p = 1 << m;
			if((p & n) >> m == 1) {
				if(i+1 >=s.length()) s = s.substring(0, i);
				else s = s.substring(0, i) + s.substring(i+1);
			} else {
				n |= p;
			}
		}
		return s;
	}
}
