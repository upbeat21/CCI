public class Solution {
	public String IDOTV(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) == ' ') {
				sb.append("%20");
				while(i < s.length() && s.charAt(i) == ' ') i++;
				i--;
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb.toString();
	}
}
