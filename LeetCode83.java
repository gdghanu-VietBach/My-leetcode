package LeetCode;

public class LeetCode83 {

	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head; // taọ 1 biến để lưu tham chiếu gốc

		while (head != null && head.next != null) {
			if (head.val == head.next.val) {
				head.next = head.next.next; // bỏ qua nút trùng
			} else {
				head = head.next; // thay đổi tham chiếu con trỏ tới nút tiếp theo
			}
		}

		return temp;
	}

	// mỗi 1 biến object sẽ là 1 tham chiếu (con trỏ) tới object đó trong vùng nhớ

	// vì vậy khi dùng head = head.next, biến head ở đây sẽ ko bị ghi đè mà chỉ đổi
	// tham chiếu tới nút tiếp theo
}
