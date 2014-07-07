import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean IDOTIV(String a, String b) {
		if(a == null && b == null) return true;
		if(a == null || b == null) return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		a = a.toLowerCase();
		b = b.toLowerCase();
		for(int i=0;i<a.length();i++) {
			char c = a.charAt(i);
			if(isAlpNum(c)) {
				if(map.containsKey(c)) map.put(c, map.get(c)+1);
				else map.put(c, 1);
			}
		}
		for(int i=0;i<b.length();i++) {
			char c = b.charAt(i);
			if(isAlpNum(c)) {
				if(!map.containsKey(c)) return false;
				int t = map.get(c);
				t--;
				if(t == 0) map.remove(c);
				else map.put(c, t);
			}
		}
		return map.isEmpty();
	}
	public boolean isAlpNum(char c) {
		return (c >= '0' && c <='9') || (c >= 'a' && c <= 'z');
	}
}
