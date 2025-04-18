package LeetCode;

public class LeetCode203 {
	// Cách 1:

	public ListNode removeElements(ListNode head, int val) {
		while (head.val == val && head != null) { // xử lý trong TH full head = val (vì trong while thứ 2 ta chỉ xét bắt
													// đầu từ head.next)
			head = head.next; // trỏ tới next cho tới khi head == null
		}

		ListNode goc = head; // lưu lại biến head gốc
		while (head != null && head.next != null) {
			if (head.next.val == val) {
				head.next = head.next.next; // bỏ qua bằng cách gắn cho next tiếp theo
			} else {
				head = head.next;
			}
		}

		return goc;
	}

	// Cách 2:

	public ListNode removeElements2(ListNode head, int val) {

		/*
		 * Idea: 
		 * 1. Tạo 1 biến (rep) có trỏ .next tới head để xét 
		 * 2. Tao 1 biến = (rep) để xét, để ko làm thay đổi biến ban đầu
		 * 
		 * Như vậy thì sẽ ko cần quan tâm tới TH full head == val
		 */

		ListNode rep = new ListNode(0, head);

		ListNode curr = rep;

		while (curr != null && curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}

		return rep.next; // trả về là biến head
	}
}
