package LeetCode;

public class LeetCode28 {

	// idea: ta sẽ sánh từng kí tự một để tìm ra đoạn giống nhau
	public int strStr(String haystack, String needle) {

		int checkNeeedle = 0;
		int checkHaystack = 0;

		while (checkHaystack < haystack.length()) {
			if (haystack.charAt(checkHaystack) == needle.charAt(checkNeeedle)) {

				checkHaystack++;
				checkNeeedle++;

				if (checkNeeedle == needle.length()) {
					return checkHaystack - checkNeeedle; // nếu đã tìm ra được đoạn giống nhau, trả lại vị trí đầu tiên giống nhau
															
				}
			} else {

				checkHaystack = checkHaystack - checkNeeedle + 1; // có 2TH xảy ra:
				                                                  // + TH1: Nếu đã giống nhau 1 đoạn trước đó thì setup về vị trí tiếp theo của vtri đầu tiên giống nhau					         
				checkNeeedle = 0; 
				                                                 // + TH2: Nếu chưa thì xét đến vtri tiếp theo (tránh vòng lặp vô hạn vì vtri xét ko thay đổi)
				 
			}
		}
		
		return -1;
	}
}
