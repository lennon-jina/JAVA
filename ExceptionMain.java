package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		System.out.println("메인 시작");
		int [] arr = { 1, 2, 3 };
		String str = null;
		try {
//			System.out.println(arr[3]);
			str.length();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 문제!!!");
		}catch(NullPointerException e) {
			System.out.println("널이다...");
		}catch(Exception e) {
//			System.out.println(e.toString());
			e.printStackTrace();   // 예외 발생 코드에 대해 추적한 내용 출력
		}finally {
			System.out.println("오류가 나도 안 나도 여긴 처리됨.");
		}
		
		// throw 메소드 호출하는 쪽에서 예외처리 해야 함.
		try {
			ExMethod.dateMillSec("2025/01/01");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// 예외
		ExMethod.dateMillSec2("2025/01/01");
		
		try {
		ExMethod.PrinterName("");
		} catch (BizException e) {
			System.out.println(e.getErrCode()); // BizException 클래스 메소드
			System.out.println(e.getMessage()); // 부모(Exception) 메소드
		}
		try {
			ExMethod.PrinterName("길");
		} catch (BizException e) {
			e.printStackTrace();
		}
		System.out.println("메인 종료");
	}
}
