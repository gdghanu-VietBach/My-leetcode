package LeetCode;

public class LeetCode21 {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

		if (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				list1.next = mergeTwoLists(list1.next, list2);
				return list1; // gán gtri của list1 cho nút tiếp theo (khi đệ quy "trở về")
			} else {
				list2.next = mergeTwoLists(list1, list2.next);
				return list2;
			}
		}

		if (list1 == null) {
			return list2; // nếu đã đến cuối list1 == null, trả về list2
		}

		return list1; // ngược lại trả về list1
	}

	// chuỗi cuối cùng trả về thực chất chính là chuỗi 1 hoặc 2 đã qua thay đổi
}
