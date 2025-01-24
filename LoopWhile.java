package ch05_conditinal;

import java.util.Scanner;

/**
 * class Name   : LoopWhile
 * Author       : JINA
 * Created Date : 2025. 1. 24.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 반복문 while
 */
public class LoopWhile {
	
	public static void main(String[] args) {
		// while(조건식) 조건식이 true이면 반복(주의 무한루프)
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(true) {
			System.out.println("=============");
			System.out.println("이름은 입력하세요.(종료q)");
			String nm = scan.nextLine();
			if(nm.equals("q")) {
				break;
			}else {
				System.out.println(nm + " 님 환영합니다.");
			}
			System.out.println("=============");
		}
		
		// while 문으로 구구단 2 ~ 9 단을 출력하시오.
		// 1. 2 ~ 9단 while문 작성
		int dan = 2;
		while(dan <= 9) {
			int su = 1;
			while(su <= 9) {
				System.out.println(dan + "단");
				System.out.printf("%d x %d = %d \n", dan, su, (dan*su));
				su++;
			}
		dan++;
		}
		// 2. 1 ~ 9수 에 해당되는 while문 작성
		// ex) 변수의 scope를 잘 생각하세요! (반복되는 단 마다 수는 1로 초기화 되어야함.)
		
		
	}

}
