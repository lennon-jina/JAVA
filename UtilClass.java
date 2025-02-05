package ch09_class.util;

/**
 * class Name   : UtilClass
 * Author       : JINA
 * Created Date : 2025. 2. 5.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : static 메서드
 */
public class UtilClass {

	/*
	 * public static 정적 메서드는 어디서든 사용할 수 있는 메서드 (해당 클래스를 인스턴스화 하지 않아도)
	 * 공통기능과 같은 부분을 정의해서 사용할 때 만드는 클래스
	 */
	public static double weRound(double num, int n) {
		int ten = 1;
		for(int i = 0; i < n; i++) {
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		double result = (double) temp/ten;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.59786945615, 3));
	}
	
}	