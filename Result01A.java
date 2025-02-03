package practice;

import java.util.Scanner;

public class Result01 {
	/* 
	 * q.1 사용자로 부터 국어, 영어, 수학 점수를 각각 입력받아 ~~~..
	 * 
	 * */
	public static void main(String[] args) {
		// 정수 나눗셈(int)
		int a = 7;
		int b = 3;
		int intResult = a/b;
		System.out.println("정수 나눗셈:"+ intResult);
		double c = 7;
		double d = 3;
		double doubleResult = c/d;
		System.out.println("double 나눗셈" + doubleResult);
		// 정수 나눗셈을 캐스팅
		double mixedReulst = (double)a/b;
		System.out.println("캐스팅된 나눗셈" + mixedReulst);
		// ex
		System.out.println(4 / 3);
		System.out.println(4 / 3.0);
		
		int intResult2 = (int) (c/d);
		System.out.println(intResult2);
		System.out.printf("결과: %.2f %n",mixedReulst);
		
		
		// 1.입력 받기
		Scanner scan = new Scanner(System.in);
		System.out.print("국어 점수 입력>>");
		String kor = scan.nextLine();
		System.out.print("영어 점수 입력>>");
		String eng = scan.nextLine();
		System.out.print("수학 점수 입력>>");
		String math = scan.nextLine();
		int intKor = Integer.parseInt(kor);
		int intEng = Integer.parseInt(eng);
		int intMath = Integer.parseInt(math);
		// 2.평균 계산
		double avg = (intKor + intEng + intMath) / 3.0;
		// 3.조건식
		String grade = "";
		if(avg >= 90) {
			grade="A";
		}else if(avg >= 80) {
			grade="B";
		}else if(avg >= 70) {
			grade="C";
		}else {
			grade="D";
		}
		System.out.println("평균 :" + avg);
		System.out.println("등급 :" + grade);
		// q.2 팩토리얼 
		long result = 1;
		for(int i = 1 ; i<=15; i++) {
			result *=i;
		}
		System.out.println("15팩토리얼:" + result);
		
		
		
		
	}
	
}
