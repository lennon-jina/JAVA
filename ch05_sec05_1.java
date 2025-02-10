package practice_jn;

/**
 * class Name   : ch05_MethodEx
 * Author       : JINA
 * Created Date : 2025. 2. 10.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : 메소드 실행 예제 연습
 */

public class ch05_sec05_1 {
	
	public static void main(String[] args) {
		// replace 메소드 (문자열 대체)
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
