package ch11_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

/**
 * class Name   : ApiMath
 * Author       : JINA
 * Created Date : 2025. 2. 10.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 자바에 있는 기본 API 사용
 */

public class ApiMath {
	public static void main(String[] args) {
		
	// math는 수학에서 사용되는 여러가지 함수들을 메서드로 제공하는 클래스
	final double PI = 3.141592;
	// round 반올림, ceil 올림, floor 내림
	long roundPI = Math.round(PI);
	System.out.println(roundPI);
	// 소수 넷째 자리에서 반올림
	double fourPI = (Math.round(PI * 1000)) / 1000.0;
	System.out.println(fourPI);
	double ceilPI = Math.ceil(PI);
	System.out.println(ceilPI);
	// 10 ~ 20 랜덤 숫자
	int random = (int) ((Math.random() * 11) + 20);
	System.out.println(random);
	// 제곱근
	System.out.println(Math.sqrt(4));
	System.out.println(randomCard());
	ArrayList<String> classMate =
			new ArrayList<>(Arrays.asList("강지석", "김도래","김병준","김서영",
										"김소연","김원진","박정단","박종욱",
										"송은호","신미정","이예성","이예은",
										"정지나","최보석","한수정"));
	HashMap<String, String> result = randomGame(classMate);
	Set<String> keySet = result.keySet();
	for(String nm : keySet) {
		System.out.println(nm + " 님은" + result.get(nm));
	}
	}
	
	// 확률카드 메소드를 만들어주세요
	// input : x
	// output : String (당첨 or 꽝)
	// 10%의 확률로 당첨되는
	// ex) randomCard()
	
	public static String randomCard() {
		String result = "꽝!";
		// random은 class로도 존재함
		Random random = new Random();
		// 1 ~ 100 사이 정수
		int num = random.nextInt(100) + 1;
		// 10% 확률로 당첨
		if(num <= 10) {
			result = "당첨";
		}
		return result;
	}
	// input : ArrayList<String>
	// output : HashMap<String, String>
	// "팽수" : "당첨"
	// "길수" : "꽝"
	
	public static HashMap<String, String> 
				randomGame(ArrayList<String> arr){
		HashMap<String, String> resultMap = new HashMap<>();
		for(int i = 0; i < arr.size(); i ++) {
			resultMap.put(arr.get(i), randomCard());
		}
		return resultMap;
	}
	
}
