package LeetCode;

public class LeetCode69 {
	public int mySqrt(int x) {

		int dau = 1;
		int cuoi = x;

		int mid = 0;

		while (dau <= cuoi) {
			mid = dau + (cuoi - dau) / 2;

			if ((long) mid * mid == (long) x) {
				return mid;
			}

			else if ((long) mid * mid > (long) x) { // phải ép kiểu long vì khi số quá to thì int sẽ ko xử lý được => Kq
													// sai
				cuoi = mid - 1;
			}

			else {
				dau = mid + 1;
			}
		}

		return cuoi;
	}
}
