package ch08_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx {

	public static void main(String[] args) {
		// 행운의 로또생성기를 만들어 주세요
		// 1. 사용자에게 수량을 입력받아서 해당 수량만큼 로또번호를 생성해주세요.
		// input : (int)수량
		// output : ArrayList<Set<integer>> (로또번호)
		// 예시
		System.out.println(happyLotto(3));  // 로또번호 3개 생성
		// Set<Integer> 데이터 형태를 담을 수 있는 ArrayList
		System.out.println("========== 행운의 로또번호 생성기 ==========");
		Scanner scan = new Scanner(System.in);
		System.out.println("몇개 만들까요?");
		System.out.println(">>>");
		int cnt = Integer.parseInt(scan.nextLine());
		ArrayList<Set<Integer>> result = happyLotto(cnt);
		for(Set<Integer> sets:result) {
			ArrayList<Integer> lotto = new ArrayList<>(sets);
			Collections.sort(lotto);
			System.out.println(lotto);
		}
		System.out.println("========== 행운이 가득하시길~ ==========");
	}
	public static ArrayList<Set<Integer>> happyLotto(int cnt) {
		ArrayList<Set<Integer>> test = new ArrayList<>();
		for(int i = 0 ; i < cnt ; i ++) {
			test.add(makeLotto());
		}
		return test;
	}
	public static Set<Integer> makeLotto(){
		Set<Integer> lotto = new HashSet<>();
		// 1 ~ 45 사이의 랜덤값 6개 생성
		while(lotto.size() < 6) {
			int num = (int) ((Math.random() * 45) + 1);
			lotto.add(num);
		}
		 
		return lotto;
	}
	
}
