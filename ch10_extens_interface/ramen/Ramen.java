package ch10_extens_interface.ramen;

/**
 * class Name   : Ramen
 * Author       : JINA
 * Created Date : 2025. 2. 7.
 * version      : 1.0
 * Purpose      : java 기초
 * Description  : 추상 클래스, 추상 메소드 사용법
 */

// abstract 추상 클래스 (미완성 클래스로 자체적으로 객체 생성이 안 됨.)
public abstract class Ramen {
	
	String name;
	int price;
	
	public Ramen(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	//추상 메소드
	public abstract void printRecipe();  // {} 없음(로직을 만들지 않은)

}
