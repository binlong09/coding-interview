import java.util.*;

class SlidingWindowStringProblem {

	public static void main(String[] args) {
	  String str1 = "whatwhywhere";
		String result1 = solution(str1);
		System.out.println(result1);
		String str2 = "hellonewyork";
		String result2 = solution(str2);
		System.out.println(result2);

	}

	public static String solution(String str) {
		if(str.length() == 0) {
			return "";
		}
		if(str.length() == 1) {
			return str;
		}
		int start = 0;
		int end = 1;
		int maxStart = 0;
		int maxEnd = 0;
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put(str.charAt(start), 1);
		while(end < str.length()) {
		if(map.get(str.charAt(end)) == null) {
				if(max < map.size()) {
					maxStart = start;
					maxEnd = end;
					max = map.size();
				}
				map.put(str.charAt(end), 1);
				end++;
			}
			else if(map.get(str.charAt(end)) == 1) {
				map.remove(str.charAt(start));
				start++;
			}
		}
		return str.substring(maxStart, maxEnd + 1);
	}
}
