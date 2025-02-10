package practice_jn;

import java.awt.DefaultKeyboardFocusManager;

/**
 * class Name   : ch05_sec06
 * Author       : JINA
 * Created Date : 2025. 2. 10.
 * version      : 1.0
 * Purpose      : java 복습
 * Description  : 배열 변수 선언 연습 예제
 */
public class ch05_sec06 {
	
	public static void main(String[] args) {
		// 배열 변수 선언
		int[] scores;
		// 배열 변수에 배열을 대입
		scores = new int[] { 83, 90, 87 };
		// 배열 항목의 총합을 구하고 출력
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
			
		}
		System.out.println("총합 : " + sum1);
		
		// 배열을 매개값으로 주고, printItem() 메소드 호출
		printItem( new int[] { 83, 90, 87 } );
	}
	
	// printItem() 메소드 선언
	public static void printItem( int[] scores) {
		// 매개변수가 참조하는 배열의 항목을 출력
		for(int i=0; i<3; i++) {
			System.out.println("socre[" + i + "]: " + scores[i]);
		}
	}

}
