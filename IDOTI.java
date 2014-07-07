public class Solution {
	public boolean IDOTI(String s) {
		if(s == null || s.length() == 0) return true;
		Set<Character> set = new HashSet<Character>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(set.contains(c)) return false;
			set.add(c);
		}
		return true;
	}
}