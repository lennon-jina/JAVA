package ch07_array;

public class ArrayEx2 {
	public static void main(String[] args) {
		// Q. 윌리를 찾아라!
		// findWally 문자열 '윌리'가 총 몇개 있는지 출력하시오.
		String findWally ="윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int cnt = 0;
 			if(findWally.contains("윌리")) {
			cnt++;
			System.out.println("윌리는 총:" + cnt);
			}
		
	}
}
