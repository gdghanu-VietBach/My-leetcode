package LeetCode;

import java.util.Arrays;

public class Leetcode455 {
	public int findContentChildren(int[] g, int[] s) {

		int count = 0; // dùng để đếm số đứa trẻ được bánh

		Arrays.sort(s); // sx lại các mảng theo thứ tự từ bé đến lớn
		Arrays.sort(g);

		int cuoiG = g.length - 1;
		int cuoiS = s.length - 1; // tìm cặp match từ cái bánh lớn nhất và đứa trẻ có greed lớn nhất

		while (cuoiS >= 0 && cuoiG >= 0) {

			if (s[cuoiS] >= g[cuoiG]) { // nếu cái bánh đó lớn hơn or bằng greed của đứa trẻ đang xét
				count++;

				cuoiS--; // chỉ khi cái bánh ở vị trí đó được match với 1 đứa trẻ thì mới xét đến cái
							// tiếp theo
			}

			cuoiG--; // match được bánh thì cũng xét đứa tiếp theo mà ko match được thì cũng phải xét
						// đứa tiếp theo cho đến khi match đc
		}

		return count;

	}
}
