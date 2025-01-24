package ch05_conditinal;

import java.util.Scanner;
// Ctrl + Shift + 5 클래스 한 번에 가져올 수 있음?

/**
 * class Name   : ConditionalEx
 * Author       : JINA
 * Created Date : 2025. 1. 23.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 조건문 연습
 */

public class ConditionalEx {
	
	public static void main(String[] args) {
		/* 사용자로부터 숫자를 입력 받아 작수인지 홀수인지 판별하시오.
		 * 조건1: 정수만 입력 받음.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(정수)");
		System.out.print(">>>");
		// if문을 사용하여 짝수면 "짝수", 홀수면 "홀수"를 출력하시오.
		
		// 1. 입력 받음 (형변환 int로)
		int num = Integer.parseInt(scan.nextLine());
		// 2. 조건식 if, 연산자 operator 사용
		if (num % 2 == 0) {
			// 3. 출력
			System.out.printf("%d 는 %s 입니다.", num, "짝수!");
		}else {
			System.out.printf("%d 는 %s 입니다.", num, "홀수!");
	}
	}
}