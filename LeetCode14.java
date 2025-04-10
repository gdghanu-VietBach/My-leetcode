package test;

public class LeetCode14 {
	public String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0) {
			return "";
		}

		String temp = strs[0]; // đặt biến temp

		int dodai = temp.length(); // lấy độ dài để trừ dần nhằm rút gọn biến temp

		for (int i = 1; i < strs.length; i++) {
			String check = strs[i];
			while (dodai > check.length() || !temp.equals(check.substring(0, dodai))) {

				if (dodai <= 0) { // nếu ko ngắt được vòng lặp -> ko có đoạn subs giống nhau -> trả về ""
					return "";
				}
				dodai--;
				temp = temp.substring(0, dodai);
			}
		}

		// ý tưởng là sẽ dừng vòng lặp khi gặp được đoạn subs của temp giống đoạn subs
		// của strs[i] và độ dài bằng nhau (chắc chắn là sẽ nhỏ hơn độ dài chuỗi ban
		// đầu)

		return temp;

	}
}
