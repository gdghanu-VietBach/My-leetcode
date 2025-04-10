package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode13 {
	public static int romanToInt(String s) {
		Map<Character, Integer> ds = new HashMap<>();

		ds.put('I', 1);
		ds.put('V', 5);
		ds.put('X', 10);
		ds.put('L', 50);
		ds.put('C', 100);
		ds.put('D', 500);
		ds.put('M', 1000);

		int convert = 0;
		int temp = 0;

		for (int i = s.length() - 1; i >= 0; i--) {

			if (ds.get(s.charAt(i)) >= temp) {
				convert = convert + ds.get(s.charAt(i));
				temp = ds.get(s.charAt(i));
			} else {
				convert = convert - ds.get(s.charAt(i));
				temp = ds.get(s.charAt(i));
			}
		}

		return convert;

	}
}
