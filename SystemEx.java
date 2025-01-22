package ch03_system;

import java.util.Scanner;

public class SystemEx {
	
	public static void main(String[] args) {
		/* 1. 사용자의 이름:나이를 입력 받아
		 * 이름 출력
		 * 나이 출력 하세요
		 * 
		 * 2. 사용자의 이름:나이를 입력 받아
		 * 변수에 각각 할당 후
		 * 해당 변수로 사용자의 이름, 나이를 출력하시오
		 * 
		 * 단) 이름의 길이가 달라질 수 있음.
		 * hint (:) 콜론을 기준으로 앞이 이름, 뒤가 나이
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("이름:나이를 입력하세요=");
		String userInput = scan.nextLine();
		System.out.println(userInput);
		System.out.println(userInput.substring(0,2));
		System.out.println(userInput.substring(3));
		
		System.out.println("입력하신 이름은: " + userInput.substring(0,2) + " 나이는: " + userInput.substring(3));

	}

}
