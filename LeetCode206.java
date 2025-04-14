package LeetCode;

public class LeetCode206 {

	public ListNode reverseList(ListNode head) {

		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode nextN = curr.next; // lưu trỏ đến nút tt (bị thay đổi trỏ về nút hiện tại)

			curr.next = prev; // thay đổi trỏ .next của nút tiếp theo (về nút phía trc nó thay vì nút sau nó)

			prev = curr; // nút trc nó chính là nút hiện tại =))))

			curr = nextN; // đi tiếp xét tiếp các nút tt

		}

		return prev;
	}
}
