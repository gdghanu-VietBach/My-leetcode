package LeetCode;

public class LeetCode9 {
	public boolean isPalindrome(int x) {

		// đảo ngược lại dãy số bằng cách nhân 10 để thêm 1 hàng vào check rồi cộng vs
		// dư sẽ là hàng đơn vị của x

		if (x < 0) {
			return false;
		}

		int xcopy = x;

		int check = 0;

		while (x > 0) {
			check = (check * 10) + (x % 10);
			x /= 10; // giảm dần x để lấy hàng đơn vị cộng dồn
		}

		return check == xcopy;
	}
}
