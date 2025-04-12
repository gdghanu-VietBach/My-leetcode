package LeetCode;

public class LeetCode58 {
	// idea: vì là đếm length từ cuối cùng nên mình sẽ đếm ngược từ cuối lên và đến
	// khi nào gặp dấu cách thì dừng lại
	public int lengthOfLastWord(String s) {

		s = s.trim(); // loại bỏ các dấu cách thừ ở đầu và cuối

		int count = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				break;
			}
			count++;
		}
		return count;
	}
}
