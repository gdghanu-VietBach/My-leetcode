package LeetCode;

public class LeetCode141 {

	// sử dụng thuật toán rùa và thỏ (fast- low), rất hiệu quả khi ko cần tạo thêm
	// Mảng khác để check

	public boolean hasCycle(ListNode head) {

		ListNode fast = head;
		ListNode low = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next; // tiến 2 bước
			low = low.next; // tiến 1 bước

			if (fast == low) { // nếu có vòng lặp, chắc chắn chúng sẽ gặp nhau
				return true;
			}
		}

		return false;
	}

	// Cách 2: đơn giản hơn là duyêt qua tất cả các nút rồi thêm chúng
	// vào 1 Set, dùng .contain để check, khi vòng lặp quay lại, chắc chắn sẽ gặp. Tuy nhiên cách này sẽ làm mất thêm bộ nhớ vì phải tạo Set


	// *Để tìm nút bắt đầu vòng lặp, ta thực hiện như sau:

	// 1. Đặt low về head, fast giữ nguyên
	// 2. Cho 2 con trỏ tiến từng bước môt, điểm gặp nhau chắc chắn sẽ là điểm bắt
	// đầu vòng lặp

	// Giải thích: chúng chỉ có thể gặp nhau tại điểm bắt đầu vòng lặp
}
