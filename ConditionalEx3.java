package ch05_conditinal;

import java.time.chrono.JapaneseChronology;

/**
 * class Name   : ConditionalEx3
 * Author       : JINA
 * Created Date : 2025. 1. 24.
 * version      : 1.0
 * Purpose      :[목적을 작성하세요]
 * Description  :[설명을 작성하세요]
 */
public class ConditionalEx3 {
	
	public static void main(String[] args) {
		/* 거꾸로 트리를 5층 만들어 주세요
		 * 실행 결과
		   ***** 
		   **** 
		   *** 
		   **
		   *
		 */
		
		// ex) 중첩 for문 or 문자열 자르기
		// 규칙 생각하기 5 -> 4 -> 3 -> 2 -> 1
		
		// 1. 문자열 자르기 함수사용
		String star = "*****";
		for(int i = 5 ; i >= 1 ; i--) {
			String subStr = star.substring(0, i);
			System.out.println(subStr);
		}
		
		// 2. 중첩 for문
		for(int i = 5 ; i >= 1 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
