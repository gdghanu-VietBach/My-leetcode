package LeetCode;

public class LeetCode26 {
	public int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int i = 0;

		for (int j = 1; j < nums.length; j++) {
			if (nums[j] != nums[i]) {
				i++;
				nums[i] = nums[j]; // khi phát hiện ptu khác, gán nó lần lượt cho các ptu đầu
			}
		}

		return i + 1;
	}
}
