package LeetCode;

import java.util.Stack;

public class LeetCode20 {
	public boolean isValid(String s) {

		// vì Stack là FILO, đúng vs t/c dấu ngoặc => dùng Stack để lưu trữ

		Stack<Character> ds = new Stack<Character>();

		for (char c : s.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') { // dấu mở thì thêm vào Stack

				ds.add(c);

			} else { // dấu đóng thì check từng cái xem giống loại nhau ko

				if (ds.isEmpty()) {
					return false;
				}

				if (c == ')') {
					if (!ds.pop().equals('(')) {
						return false;
					}
				}
				if (c == '}') {
					if (!ds.pop().equals('{')) {
						return false;
					}
				}
				if (c == ']') {
					if (!ds.pop().equals('[')) {
						return false;
					}
				}

			}
		}
		return ds.isEmpty(); // tất cả ngoặc đều phải có cặp => stack phải đc pop hết (empty)

	}
}
