package ch05_conditinal;

import java.util.Scanner;

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
		String number = scan.nextLine();
		int nm = Integer.parseInt(number);
		// 2. 조건식 if, 연산자 operator 사용
		if (nm % 2 == 1) {
			System.out.println("홀수");
		}else if ( nm % 2 == 0) {
			System.out.println("짝수");
	}
		// 3. 출력
	}
}