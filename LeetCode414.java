package LeetCode;

import java.util.Arrays;

public class LeetCode414 {
	public int thirdMax(int[] nums) {

		// đề bài yêu cầu tìm số khác biệt lớn thứ ba

		// idea: sắp xếp rồi xét từ cuối lên, mỗi lần gặp 1 số khác sẽ count++, đến khi
		// count = 3 thì đó chính là số lớn thứ 3

		Arrays.sort(nums);

		int count = 1;
		int temp = nums[nums.length - 1];
		int max = nums[nums.length - 1];

		for (int i = nums.length - 2; i >= 0; i--) {

			if (temp != nums[i]) {

				count += 1;

				if (count == 3) {
					return nums[i];
				}
			}

			temp = nums[i];
			max = Math.max(max, nums[i]);
		}

		return max;
	}
}
