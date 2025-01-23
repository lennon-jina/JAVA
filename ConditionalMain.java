package ch05_conditinal;



/**
 * class Name   : ConditionalMain
 * Author       : JINA
 * Created Date : 2025. 1. 23.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 조건문 if
 */
public class ConditionalMain {
	
	public static void main(String[] args) {
		int score = 91;
		String grade = "";
		if(score >= 90) {   // if 문은 해당 조건이 true 이면 {} 해당 영역으로 진입
			grade = "A";
			System.out.println("조건이 true이군..");   // 이건 if 가 true 일 때 실행 (여러개 구문 가능)
		}else if (score >=80) {   // 조건이 더 있다면 else if 추가
			grade = "B";
		}else {   // 그밖에 모든 상황
			grade = "C";
		}
		System.out.println(score + "는 " + grade);
		
		// 변수의 scope
		int price = 3000;
		int myMoney = 1000;
		
		if (price > myMoney) {
			System.out.println("돈이 부족합니다...");
		}else {
			System.out.println("돈이 충분합니다.");
		}
		
		// 중첩 if 가능 if문 안에 if문
		// 조건 1: 이름은 1글자 이상
		// 조건 2: 전화번호는 10 or 11 자리
		// 조건 1이 만족하지 않으면 가입 실패
		String nm = "닉";
		String phone = "0101234567";
		
		// 조건 1
		if(nm.length() >=1) {
			// 조건 1 || <-- or 또는의 의미
			if(phone.length() == 10 || phone.length() == 11) {
				System.out.println("환영 합니다.");
			}else {
				System.out.println("가입 실패!!");
			}
		}else {
			System.out.println("가입 실패!!");
		}
	
		
	}

}
