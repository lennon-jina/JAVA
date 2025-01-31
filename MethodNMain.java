package ch06_method;

/**
 * class Name   : MethodNMain
 * Author       : JINA
 * Created Date : 2025. 1. 31.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : java의 함수 (클래스에 종속되어 있는 method)
 */

public class MethodNMain {
	// main 메소드 public 이며 static 하여 어디서든 사용 가능하고
	// void 라 리턴이 없으며 매개변수 한개 String [] 배열 타입)
	public static void main(String[] args) {
		printSum(1, 100);  // 메소드 실행
		printSum(1, 10);  
		printSum(5, 20);
		System.out.println(returnSum(1, 50));
		int result = returnSum(2, 4);
		System.out.println(result);
		
		print("안녕하세요");
		print(10);
		print(10.41);
		
		print(factorial(15));
	}
	
	// 2개의 정수를 입력 받아 리턴 없이 출력하는 함수
	public static void printSum(int from, int to) {
		int sum = 0;
		for(int i = from ; i <= to; i ++) {
			sum += i;
		}
		System.out.printf("from: %d 부터 to: %d 까지 합은: %d \n", from, to, sum);
	}
	
	// 2개의 정수를 입력 받아 리턴하는 함수
	public static int returnSum(int from, int to) {
		int sum = 0;
		for(int i = from ; i <= to; i ++) {
			sum += i;
		}
		return sum;   // 리턴 타입이 맞아야함.
	}
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static void print(double msg) {
		System.out.println(msg);
	}
	
	// 팩토리얼 메소드를 만드시오
	// input : int
	// output : long
	// method name : factorial
	
	public static long factorial(int num) {
		long result = 1;
		for(int i = 1 ; i <= num; i ++) {
			result *= i;
		}	
			return result;
		
	}
	
}
