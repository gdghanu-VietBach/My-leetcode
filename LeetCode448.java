package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode448 {

	// idea: 1. nhân nums[ptu - 1] với -1
	// 2. xét lại mảng 1 lần nữa, nếu tại i mà nums[i] !< 0 nghĩa là ko có số i + 1
	// xuất hiện trong mảng ban đầu

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> ds = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1; // nhân nums[ptu - 1] với -1
			if (nums[index] > 0) { // nếu ptu tại đó > 0 (chưa bị nhân với -1)
				nums[index] *= -1;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				ds.add(i + 1);
			}
		}

		return ds;
	}
}

// trong bài này ko nên làm gán ptu =0 vì như vậy các ptu xét sau đã bị ghi đè r, còn nếu *-1 thì sau dùng gtri tuyệt đối abs vẫn khôi phục lại được
